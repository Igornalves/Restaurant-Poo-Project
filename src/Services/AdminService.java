package Services;

import Class.Admin;

import java.util.List;
import java.util.ArrayList;

public class AdminService {

    private List<Admin> admins;

    public AdminService() {
        this.admins = new ArrayList<>();
    }

    public void registrarAdmin(Admin admin) {
        if (admin != null) {
            admins.add(admin);
            System.out.println("Admin registrado: " + admin.getNome() + " sucesso !!!");
        } else {
            System.out.println("Admin, erro de registro !!!!");
        }
    }

    public void listandoAdmins() {
        System.out.println("Listando os Admins existentes no restaurante");
        for (int i = 0; i < admins.size(); i++) {
            System.out.println(admins.get(i).getNome());
        }
    }

    public void removerAdmin(Admin admin) {
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getNome() == admin.getNome()) {
                admins.remove(i);
                System.out.println("Admin removido com o nome " + admin.getNome() + " com Sucesso !!!");
            }
        }
    }

}
