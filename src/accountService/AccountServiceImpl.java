package accountService;

class AccountServiceImpl implements AccountService {

    private Account[] accounts;

    AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        Account foundAccount = null;
        for (Account account : accounts) {
            if (account.getOwner().getId() == id) {
                foundAccount = account;
                countAccountsWithBalanceGreaterThan(account.getBalance());
            }
        }
        return foundAccount;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long numOfAccounts = 0;
        for (Account account : accounts) {
            if (account.getBalance() > value) {
                numOfAccounts++;
            }
        }

        return numOfAccounts;
    }

    public static void main(String[] args) {
        Account[] accounts = {
                new Account(12, 5847, new User(1, "user1", "xyz")),
                new Account(14, 5847, new User(5, "user2", "abz"))
        };

        AccountService service = new AccountServiceImpl(accounts);
        System.out.println(service.findAccountByOwnerId(1));
    }
}
