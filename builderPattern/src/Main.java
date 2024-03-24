package builderPattern.src;

public class Main {
    public static void main(String[] args) {
        Company company = new Company.CompanyBuilder("GeoValue", "Environment")
        .setCountry("Singapore")
        .setHasOffice(true)
        .build();
        System.out.println("The company name is " + company.getName());
        System.out.println("The company industry is " + company.getIndustry());     
        System.out.println("The company was incorporated in " + company.getCountry());
        System.out.println("The company has an office: " + company.isHasOffice());


        
    }
}
