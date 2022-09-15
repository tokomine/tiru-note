package org.tokomine.tirunote.test.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author tokomine
 */
@Component
@Data
public class SpringComponent {
    final OtherComponent otherComponent;

    public SpringComponent(@Autowired OtherComponent otherComponent) {
        this.otherComponent = otherComponent;
    }

    public void print() {
        System.out.println("Hello SpringComponent");
        otherComponent.print();
    }
}
