package tr.serhatkochan.personinformationsystemwithqrcode.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tr.serhatkochan.personinformationsystemwithqrcode.business.abstracts.QrCodeService;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.CreateQrCodeRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.requests.UpdateQrCodeRequest;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetAllQrCodesResponse;
import tr.serhatkochan.personinformationsystemwithqrcode.business.responses.GetByCodeQrCodesResponse;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/qrCodes")
@AllArgsConstructor
public class QrCodesController {
    private QrCodeService qrCodeService;

    @GetMapping
    public List<GetAllQrCodesResponse> getAll() {
        return qrCodeService.getAll();
    }

    @GetMapping("/{code}")
    public GetByCodeQrCodesResponse getByCode(@PathVariable String code) {
        return qrCodeService.getByCode(code);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateQrCodeRequest createQrCodeRequest) {
        qrCodeService.add(createQrCodeRequest);
    }

    @PutMapping
    public void update(@RequestBody UpdateQrCodeRequest updateQrCodeRequest) {
        qrCodeService.update(updateQrCodeRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        qrCodeService.delete(id);
    }

}
