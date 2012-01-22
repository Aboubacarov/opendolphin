package open.dolphin.converter;

import open.dolphin.infomodel.ExtRefModel;
import open.dolphin.infomodel.IInfoModel;

/**
 *
 * @author Kazushi Minagawa, Digital Globe, Inc.
 */
public final class ExtRefModelConverter implements IInfoModelConverter {

    private ExtRefModel model;

    public ExtRefModelConverter() {
    }

    public String getContentType() {
        return model.getContentType();
    }

    public String getTitle() {
        return model.getTitle();
    }

    public String getHref() {
        return model.getHref();
    }

    public String getMedicalRole() {
        return model.getMedicalRole();
    }

    public String getSop() {
        return model.getSop();
    }

    public String getUrl() {
        return model.getUrl();
    }

    public String getBucket() {
        return model.getBucket();
    }

    @Override
    public void setModel(IInfoModel model) {
        this.model = (ExtRefModel)model;
    }
}
