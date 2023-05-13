package tr.serhatkochan.personinformationsystemwithqrcode.business.rules;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tr.serhatkochan.personinformationsystemwithqrcode.core.utilities.exceptions.BusinessException;
import tr.serhatkochan.personinformationsystemwithqrcode.dataAccess.abstracts.QrCodeRepository;

@Service
@AllArgsConstructor
public class QrCodeBusinessRules {
    private QrCodeRepository qrCodeRepository;

    public void checkIfQrCodeCodeExists(String code) { // kontrol et eğer, qrCode'un code'su var mı
        if (qrCodeRepository.existsByCode(code)) {
            throw new BusinessException("QrCode code already exists"); // Java exception types
        }
    }
}
