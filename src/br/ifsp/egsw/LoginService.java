package br.ifsp.egsw;

public class LoginService {

    public boolean login(String username, String password) {
        if (username == null || username.isBlank()) return false;
        if (password == null || password.length() < 6) return false;

        // Regra simples: usuário e senha não podem ser iguais e senha deve conter um dígito.
        if (username.equals(password)) return false;
        boolean temDigito = password.chars().anyMatch(Character::isDigit);
        return temDigito;
    }
}
