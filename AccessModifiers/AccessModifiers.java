class DefaultAccessModifier {
    void message(){
        System.out.println("This is for Default");
    }
}

class PublicAccessModifier {
    public void message(){
        System.out.println("This is for Public");
    }
}

class PrivateAccessModifier {
    private void message(){
        System.out.println("This is  for Private");
    }
}

class ProtectedAccessModifier {
    protected void message(){
        System.out.println("This is  Protected");
    }
}

class Main{
    public static void main(String[] args) {
        DefaultAccessModifier defaultacc = new DefaultAccessModifier();
        defaultacc.message();
        
        PublicAccessModifier publicacc = new PublicAccessModifier();
        publicacc.message();
        
        PrivateAccessModifier privateacc = new PrivateAccessModifier();
        privateacc.message();
        
        ProtectedAccessModifier protectedacc = new ProtectedAccessModifier();
        protectedacc.message();
    }
}
