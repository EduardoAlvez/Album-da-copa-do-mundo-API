package br.ufpb.dcx.dsc.figurinhas.services.exceptions;

public class FigurinhaNotFoundException extends RuntimeException {
    public FigurinhaNotFoundException(String message) {
        super(message);
    }
}

