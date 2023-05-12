# Getting Started

## Build

```bash
./mvnw clean package
```

## Run

```bash
java -jar -Dsleep=10000 -Dserver.port=8080 target/service-0.0.1-SNAPSHOT.jar
```

**Note:** ***-Dsleep=10000*** it's mean sleep in 10s


## Try to call the webservice

```bash
curl --location 'http://localhost:8080/ws' 
--header 'Content-Type: text/xml' 
--data '<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <soapenv:Body>
        <submitApplicationRequest
			xmlns="https://eip.kehakiman.gov.my/services/">
            <source
				xmlns="">ETP
			</source>
            <transactionID
				xmlns="">20230512231649
			</transactionID>
            <username
				xmlns="">etpapi01
			</username>
            <password
				xmlns="">etpapi01
			</password>
            <eventName
				xmlns="">MyeTaPPApplication
			</eventName>
            <data
				xmlns="">
                <petitionNo>PTN(TEST)004/2023</petitionNo>
                <dName>WAGIRAN BIN NGADI</dName>
                <dNameOther></dNameOther>
                <dNewIC>301010015177</dNewIC>
                <dOldIC></dOldIC>
                <dOtherIDType>IC</dOtherIDType>
                <dOtherID></dOtherID>
                <dDeathCertNo></dDeathCertNo>
                <dDate>1998-04-19T00:00:00.00</dDate>
                <cardType>BC</cardType>
                <applicationType>I</applicationType>
                <applicationDate>2023-05-12T23:16:01.00</applicationDate>
                <applicantName>HUSIN BIN WAGIRAN</applicantName>
                <applicantIC>540203015059</applicantIC>
                <applicantRelationship>Wife</applicantRelationship>
                <applicantRelOther></applicantRelOther>
                <officeName>47</officeName>
                <docContent></docContent>
            </data>
        </submitApplicationRequest>
    </soapenv:Body>
</soapenv:Envelope>'
```