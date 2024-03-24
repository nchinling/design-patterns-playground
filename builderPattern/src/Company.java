package builderPattern.src;

public class Company {
    private String name;
    private String industry;
    private String country; 
    private boolean isProfitable;
    private boolean hasOffice;

    

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public String getCountry() {
        return country;
    }

    public boolean isProfitable() {
        return isProfitable;
    }

    public boolean isHasOffice() {
        return hasOffice;
    }

    private Company(CompanyBuilder companyBuilder)
    {
        this.name = companyBuilder.name;
        this.industry = companyBuilder.industry;
        this.country = companyBuilder.country;
        this.isProfitable = companyBuilder.isProfitable;
        this.hasOffice = companyBuilder.hasOffice;

    }

    public static class CompanyBuilder {
        private String name;
        private String industry;
        private String country; 
        private boolean isProfitable;
        private boolean hasOffice;

        // necessary fields
        public CompanyBuilder(String name, String industry){
            this.name = name;
            this.industry = industry;
        }

        public CompanyBuilder setCountry(String country){
            this.country = country;
            return this;
        }

        public CompanyBuilder setIsProfitable(boolean isProfitable){
            this.isProfitable = isProfitable;
            return this;
        }

        public CompanyBuilder setHasOffice(boolean hasOffice){
            this.hasOffice = hasOffice;
            return this;
        }

        public Company build(){
            return new Company(this);
        }
    }
    
}
