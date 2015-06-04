package jp.co.kke.sample.parametersample;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "parameterBean")
@SessionScoped
public class ParameterBean implements Serializable {

    @Getter @Setter
    private String param;
}
