package tr.serhatkochan.personinformationsystemwithqrcode.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts.QrCodeService;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateQrCodeRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllQrCodesResponse;
import tr.serhatkochan.personinformationsystemwithqrcode.business.rules.QrCodeBusinessRules;
import tr.serhatkochan.personinformationsystemwithqrcode.core.utilities.mappers.ModelMapperService;
import tr.serhatkochan.personinformationsystemwithqrcode.dataAccess.abstracts.QrCodeRepository;
import tr.serhatkochan.personinformationsystemwithqrcode.entities.concretes.QrCode;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class QrCodeManager implements QrCodeService {
    private QrCodeRepository qrCodeRepository;
    private ModelMapperService modelMapperService;
    private QrCodeBusinessRules qrCodeBusinessRules;

    @Override
    public List<GetAllQrCodesResponse> getAll() {
        List<QrCode> qrCodes = qrCodeRepository.findAll();
        List<GetAllQrCodesResponse> getAllQrCodesResponses = qrCodes.stream()
                .map(qrCode -> modelMapperService.forResponse()
                        .map(qrCode, GetAllQrCodesResponse.class))
                .collect(Collectors.toList());
        return getAllQrCodesResponses;
    }

    @Override
    public void add(CreateQrCodeRequest createQrCodeRequest) {
        qrCodeBusinessRules.checkIfQrCodeCodeExists(createQrCodeRequest.getCode()); // spagetti kodu önler
        QrCode qrCode = modelMapperService.forRequest().map(createQrCodeRequest, QrCode.class);
        qrCodeRepository.save(qrCode);
    }
}
