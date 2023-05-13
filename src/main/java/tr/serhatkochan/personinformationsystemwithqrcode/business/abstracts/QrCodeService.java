package tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts;

import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateQrCodeRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllQrCodesResponse;

import java.util.List;

public interface QrCodeService {
    List<GetAllQrCodesResponse> getAll();

    void add(CreateQrCodeRequest createQrCodeRequest);
}
