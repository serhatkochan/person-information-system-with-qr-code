package tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts;

import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateQrCodeRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.UpdateQrCodeRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllQrCodesResponse;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetByCodeQrCodesResponse;

import java.util.List;

public interface QrCodeService {
    List<GetAllQrCodesResponse> getAll();

    GetByCodeQrCodesResponse getByCode(String code);


    void add(CreateQrCodeRequest createQrCodeRequest);

    void update(UpdateQrCodeRequest updateQrCodeRequest);

    void delete(Integer id);
}
