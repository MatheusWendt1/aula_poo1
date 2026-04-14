public class Usuarios {
    private int idUsuario;
    public String nome;
    protected String CPF;
    public String email;
    private String senha;
    public String telefone;
    public String tipoUsuario;

    public Usuarios(int idUsuario, String nome, String CPF, String email, String senha, String telefone,String tipoUsuario){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString(){
        return "Id: " + idUsuario +
                ", Nome:" + nome +
                ", CPF:" + CPF +
                ",email:" + email +
                ",Telefone:" + telefone +
                ",Tipo Usuario:" + tipoUsuario ;
    }
    public int  getidUsuario(){
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email = email;
    }

    public String getsenha(){
        return senha;
    }
    public void setsenha(String senha){
        this.senha = senha;
    }

    public String gettelefone(){
        return telefone;
    }

    public String gettipoUsuario(){
        return tipoUsuario;
    }
    public void settipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }

}

