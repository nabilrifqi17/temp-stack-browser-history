package com.github.affandes.kuliah.pm;

public class Main {
    public static void main(String[] args) {
        import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {

    private Stack<String> history = new Stack<>();
    private Scanner scanner = new Scanner(System.in);

    public void view() {
        if (history.isEmpty()) {
            System.out.println("History kosong!");
            return;
        }

        System.out.println("\n=== HISTORY (paling baru di atas) ===");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
        System.out.println("====================================\n");
    }

    public void browse() {
        System.out.print("Masukkan URL website: ");
        String url = scanner.nextLine();
        history.push(url);
        System.out.println("Website '" + url + "' ditambahkan ke history.\n");
    }
    public void back() {
        if (history.isEmpty()) {
            System.out.println("Tidak ada history untuk kembali!\n");
            return;
        }

        String removed = history.pop();
        System.out.println("Kembali dari '" + removed + "'.");

        if (!history.isEmpty()) {
            System.out.println("Sekarang berada di: " + history.peek() + "\n");
        } else {
            System.out.println("History kosong sekarang.\n");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("===== MENU BROWSER =====");
            System.out.println("1. View History");
            System.out.println("2. Browse Website");
            System.out.println("3. Back");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: view(); break;
                case 2: browse(); break;
                case 3: back(); break;
                case 4:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        }
    }

    public static void main(String[] args) {
        BrowserHistory app = new BrowserHistory();
        app.menu();
    }
}


    }
}
