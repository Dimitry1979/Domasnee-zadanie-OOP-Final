package View;

import Operations.Model;
import Presentation.Presenter;

public class program {

    public static void main(String[] args) {

        @SuppressWarnings({ "unchecked", "rawtypes" })
        Presenter presenter = new Presenter(new UI(), new Model());

        presenter.runOperation();

    }
}