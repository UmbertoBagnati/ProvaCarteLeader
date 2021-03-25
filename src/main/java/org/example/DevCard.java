package org.example;

public class DevCard {
    private final int prezzo;
    private final Resource resource;

    public DevCard(int prezzo, Resource resource) {
        this.prezzo = prezzo;
        this.resource = resource;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public Resource getResource() {
        return resource;
    }
}
