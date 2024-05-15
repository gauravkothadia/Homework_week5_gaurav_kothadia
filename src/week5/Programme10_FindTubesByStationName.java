package week5;
/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name. If possible try to implement whole of Greater London.
 */

import java.util.*;

public class Programme10_FindTubesByStationName {
    // creating instance hashmap variables to store stations names and line names
    HashMap<String, String> hmBakerloo = new HashMap<>();
    HashMap<String, String> hmCentral = new HashMap<>();
    HashMap<String, String> hmCircle = new HashMap<>();
    HashMap<String, String> hmWaterlooAndCity = new HashMap<>();
    HashMap<String, String> hmVictoria = new HashMap<>();
    HashMap<String, String> hmTram = new HashMap<>();
    HashMap<String, String> hmPiccadilly = new HashMap<>();
    HashMap<String, String> hmNorthern = new HashMap<>();
    HashMap<String, String> hmMetropolitan = new HashMap<>();
    HashMap<String, String> hmLondonOverground = new HashMap<>();
    HashMap<String, String> hmJubilee = new HashMap<>();
    HashMap<String, String> hmHammersmithAndCity = new HashMap<>();
    HashMap<String, String> hmElizabeth = new HashMap<>();
    HashMap<String, String> hmDlr = new HashMap<>();
    HashMap<String, String> hmDistrict = new HashMap<>();


    // creating the output Arraylist of tube lines passing through a particular station fulfilling condition.
    ArrayList<String> passingByLines = new ArrayList<>();

    // station list for a tube lines.
    public void stationListForTube() {

        String[] lines = {"Bakerloo", "Central", "Circle", "District", "DLR", "Elizabeth line", "Hammersmith & City", "IFS Cloud Cable Car", "Jubilee", "London Overground", "Metropolitan", "Northern", "Piccadilly", "Tram", "Victoria", "Waterloo & City"};

        String[] bakerloo = {"Elephant & Castle Underground Station", "Lambeth North Underground Station", "Waterloo Underground Station", "Embankment Underground Station", "Charing Cross Underground Station", "Piccadilly Circus Underground Station", "Oxford Circus Underground Station", "Regent's Park Underground Station", "Baker Street Underground Station", "Marylebone Underground Station", "Edgware Road (Bakerloo) Underground Station", "Paddington Underground Station", "Warwick Avenue Underground Station", "Maida Vale Underground Station", "Kilburn Park Underground Station", "Queen's Park Underground Station", "Kensal Green Underground Station", "Willesden Junction Underground Station", "Harlesden Underground Station", "Stonebridge Park Underground Station", "Wembley Central Underground Station", "North Wembley Underground Station", "South Kenton Underground Station", "Kenton Underground Station", "Harrow & Wealdstone Underground Station", "ABC station"};
        String[] central = {"Ealing Broadway Underground Station", "West Acton Underground Station", "North Acton Underground Station", "East Acton Underground Station", "White City Underground Station", "Shepherd's Bush (Central) Underground Station", "Holland Park Underground Station", "Notting Hill Gate Underground Station", "Queensway Underground Station", "Lancaster Gate Underground Station", "Marble Arch Underground Station", "Bond Street Underground Station", "Oxford Circus Underground Station", "Tottenham Court Road Underground Station", "Holborn Underground Station", "Chancery Lane Underground Station", "St. Paul's Underground Station", "Bank Underground Station", "Liverpool Street Underground Station", "Bethnal Green Underground Station", "Mile End Underground Station", "Stratford Underground Station", "Leyton Underground Station", "Leytonstone Underground Station", "Snaresbrook Underground Station", "South Woodford Underground Station", "Woodford Underground Station", "Buckhurst Hill Underground Station", "Loughton Underground Station", "Debden Underground Station", "Theydon Bols Underground Station", "Epping Underground Station", "ABC station"};
        String[] circle = {"Hammersmith (H&C Line) Underground Station", "Goldhawk Road Underground Station", "Shepherd's Bush Market Underground Station", "Wood Lane Underground Station", "Latimer Road Underground Station", "Ladbroke Grove Underground Station", "Westbourne Park Underground Station", "Royal Oak Underground Station", "Paddington (H&C Line]-Underground", "Baker Street Underground Station", "Great Portland Street Underground Station", "Euston Square Underground Station", "King's Cross St. Pancras Underground Station", "Farringdon Underground Station", "Barbican Underground Station", "Moorgate Underground Station", "Liverpool Street Underground Station", "Aldgate Underground Station", "Tower Hill Underground Station", "Monument Underground Station", "Cannon Street Underground Station", "Mansion House Underground Station", "Blackfriars Underground Station", "Temple Underground Station", "Embankment Underground Station", "Westminster Underground Station", "St. James's Park Underground Station", "Victoria Underground Station", "Sloane Square Underground Station", "South Kensington Underground Station", "Gloucester Road Underground Station", "High Street Kensington Underground Station", "Notting Hill Gate Underground Station", "Bayswater Underground Station", "Paddington Underground Station", "Edgware Road (Circle Line) Underground Station"};
        String[] waterlooAndCity = {"Bank Underground Station", "Waterloo Underground Station "};
        String[] victoria = {"Blackhorse Road Underground Station", "Brixton Underground Station", "Euston Underground Station", "Finsbury Park Underground Station", "Green Park Underground Station", "Highbury & Islington Underground Station", "King's Cross St. Pancras Underground Station", "Oxford Circus Underground Station", "Pimlico Underground Station", "Seven Sisters Underground Station", "Stockwell Underground Station", "Tottenham Hale Underground Station", "Vauxhall Underground Station", "Victoria Underground Station", "Walthamstow Central Underground Station", "Warren Street Underground Station"};
        String[] tram = {"Addington Village Tram Stop", "Addiscombe Tram Stop", "Ampere Way Tram Stop", "Arena Tram Stop", "Avenue Road Tram Stop", "Beckenham Junction Tram Stop", "Beckenham Road Tram Stop", "Beddington Lane Tram Stop", "Belgrave Walk Tram Stop", "Birkbeck Tram Stop", "Blackhorse Lane Tram Stop", "Centrale Tram Stop", "Church Street Tram Stop", "Coombe Lane Tram Stop", "Dundonald Road Tram Stop", "East Croydon Tram Stop", "Elmers End Tram Stop", "Fieldway Tram Stop", "George Street Tram Stop", "Gravel Hill Tram Stop", "Harrington Road Tram Stop", "King Henry's Drive Tram Stop", "Lebanon Road Tram Stop", "Lloyd Park Tram Stop", "Merton Park Tram Stop", "Mitcham Junction Tram Stop", "Mitcham Tram Stop", "Morden Road Tram Stop", "New Addington Tram Stop", "Phipps Bridge Tram Stop", "Reeves Corner Tram Stop", "Sandilands Tram Stop", "Therapia Lane Tram Stop", "Waddon Marsh Tram Stop", "Wandle Park Tram Stop", "Wellesley Road Tram Stop", "West Croydon Tram Stop", "Wimbledon Tram Stop", "Woodside Tram Stop "};
        String[] piccadilly = {"Acton Town Underground Station", "Alperton Underground Station", "Arnos Grove Underground Station", "Arsenal Underground Station", "Barons Court Underground Station", "Boston Manor Underground Station", "Bounds Green Underground Station", "Caledonian Road Underground Station", "Cockfosters Underground Station", "Covent Garden Underground Station", "Earl's Court Underground Station", "Eastcote Underground Station", "Finsbury Park Underground Station", "Gloucester Road Underground Station", "Green Park Underground Station", "Hammersmith (Dist&Picc Line) Underground Station", "Hatton Cross Underground Station", "Heathrow Terminal 4 Underground Station", "Heathrow Terminal 5 Underground Station", "Heathrow Terminals 2 & 3 Underground Station", "Hillingdon Underground Station", "Holborn Underground Station", "Holloway Road Underground Station", "Hounslow Central Underground Station", "Hounslow East Underground Station", "Hounslow West Underground Station", "Hyde Park Corner Underground Station", "Ickenham Underground Station", "King's Cross St. Pancras Underground Station", "Knightsbridge Underground Station", "Leicester Square Underground Station", "Manor House Underground Station", "North Ealing Underground Station", "Northfields Underground Station", "Oakwood Underground Station", "Osterley Underground Station", "Park Royal Underground Station", "Piccadilly Circus Underground Station", "Rayners Lane Underground Station", "Ruislip Manor Underground Station", "Ruislip Underground Station", "Russell Square Underground Station", "South Ealing Underground Station", "South Harrow Underground Station", "South Kensington Underground Station", "Southgate Underground Station", "Sudbury Hill Underground Station", "Sudbury Town Underground Station", "Turnham Green Underground Station", "Turnpike Lane Underground Station", "Uxbridge Underground Station", "Wood Green Underground Station "};
        String[] northern = {"Angel Underground Station", "Archway Underground Station", "Balham Underground Station", "Bank Underground Station", "Battersea Power Station Underground Station", "Belsize Park Underground Station", "Borough Underground Station", "Brent Cross Underground Station", "Burnt Oak Underground Station", "Camden Town Underground Station", "Chalk Farm Underground Station", "Charing Cross Underground Station", "Clapham Common Underground Station", "Clapham North Underground Station", "Clapham South Underground Station", "Colindale Underground Station", "Colliers Wood Underground Station", "East Finchley Underground Station", "Edgware Underground Station", "Elephant & Castle Underground Station", "Embankment Underground Station", "Euston Underground Station", "Finchley Central Underground Station", "Golders Green Underground Station", "Goodge Street Underground Station", "Hampstead Underground Station", "Hendon Central Underground Station", "High Barnet Underground Station", "Highgate Underground Station", "Kennington Underground Station", "Kentish Town Underground Station", "King's Cross St. Pancras Underground Station", "Leicester Square Underground Station", "London Bridge Underground Station", "Mill Hill East Underground Station", "Moorgate Underground Station", "Morden Underground Station", "Mornington Crescent Underground Station", "Nine Elms Underground Station", "Old Street Underground Station", "Oval Underground Station", "South Wimbledon Underground Station", "Stockwell Underground Station", "Tooting Bec Underground Station", "Tooting Broadway Underground Station", "Tottenham Court Road Underground Station", "Totteridge & Whetstone Underground Station", "Tufnell Park Underground Station", "Warren Street Underground Station", "Waterloo Underground Station", "West Finchley Underground Station", "Woodside Park Underground Station"};
        String[] metropolitan = {"Aldgate Underground Station", "Amersham Underground Station", "Baker Street Underground Station", "Barbican Underground Station", "Chalfont & Latimer Underground Station", "Chesham Underground Station", "Chorleywood Underground Station", "Croxley Underground Station", "Eastcote Underground Station", "Euston Square Underground Station", "Farringdon Underground Station", "Finchley Road Underground Station", "Great Portland Street Underground Station", "Harrow-on-the-Hill Underground Station", "Hillingdon Underground Station", "Ickenham Underground Station", "King's Cross St. Pancras Underground Station", "Liverpool Street Underground Station", "Moor Park Underground Station", "Moorgate Underground Station", "North Harrow Underground Station", "Northwick Park Underground Station", "Northwood Hills Underground Station", "Northwood Underground Station", "Pinner Underground Station", "Preston Road Underground Station", "Rayners Lane Underground Station", "Rickmansworth Underground Station", "Ruislip Manor Underground Station", "Ruislip Underground Station", "Uxbridge Underground Station", "Watford Underground Station", "Wembley Park Underground Station", "West Harrow Underground Station"};
        String[] londonOverground = {"Acton Central Rail Station", "Anerley Rail Station", "Barking Rail Station", "Barking Riverside", "Bethnal Green Rail Station", "Blackhorse Road Rail Station", "Brockley Rail Station", "Brondesbury Park Rail Station", "Brondesbury Rail Station", "Bruce Grove Rail Station", "Bush Hill Park Rail Station", "Bushey Rail Station", "Caledonian Road & Barnsbury Rail Station", "Cambridge Heath (London) Rail Station", "Camden Road Rail Station", "Canada Water Rail Station", "Canonbury Rail Station", "Carpenders Park Rail Station", "Cheshunt Rail Station", "Chingford Rail Station", "Clapham High Street Rail Station", "Clapham Junction Rail Station", "Clapham Junction Rail Station", "Clapton Rail Station", "Crouch Hill Rail Station", "Crystal Palace Rail Station", "Dalston Junction Rail Station", "Dalston Kingsland Rail Station", "Denmark Hill Rail Station", "Edmonton Green Rail Station", "Emerson Park Rail Station", "Enfield Town Rail Station", "Finchley Road & Frognal Rail Station", "Forest Hill Rail Station", "Gospel Oak Rail Station", "Gunnersbury Rail Station", "Hackney Central Rail Station", "Hackney Downs Rail Station", "Hackney Wick Rail Station", "Haggerston Rail Station", "Hampstead Heath Rail Station", "Harlesden Rail Station", "Harringay Green Lanes Rail Station", "Harrow & Wealdstone Rail Station", "Hatch End Rail Station", "Headstone Lane Rail Station", "Highams Park Rail Station", "Highbury & Islington Rail Station", "Homerton Rail Station", "Honor Oak Park Rail Station", "Hoxton Rail Station", "Imperial Wharf Rail Station", "Kensal Green Rail Station", "Kensal Rise Rail Station", "Kensington (Olympia) Rail Station", "Kentish Town West Rail Station", "Kenton Rail Station", "Kew Gardens Rail Station", "Kilburn High Road Rail Station", "Leyton Midland Road Rail Station", "Leytonstone High Road Rail Station", "London Euston Rail Station", "London Fields Rail Station", "London Liverpool Street Rail Station", "New Cross ELL Rail Station", "New Cross Gate Rail Station", "North Wembley Rail Station", "Norwood Junction Rail Station", "Peckham Rye Rail Station", "Penge West Rail Station", "Queens Park (London) Rail Station", "Queens Road Peckham Rail Station", "Rectory Road Rail Station", "Richmond (London) Rail Station", "Romford Rail Station", "Rotherhithe Rail Station", "Seven Sisters Rail Station", "Shadwell Rail Station", "Shepherds Bush Rail Station", "Shoreditch High Street Rail Station", "Silver Street Rail Station", "South Acton Rail Station", "South Hampstead Rail Station", "South Kenton Rail Station", "South Tottenham Rail Station", "Southbury Rail Station", "St James Street (London) Rail Station", "Stamford Hill Rail Station", "Stoke Newington Rail Station", "Stonebridge Park Rail Station", "Stratford (London) Rail Station", "Surrey Quays Rail Station", "Sydenham Rail Station", "Theobalds Grove Rail Station", "Turkey Street Rail Station", "Upminster Rail Station", "Upper Holloway Rail Station", "Walthamstow Central Rail Station", "Walthamstow Queens Road Rail Station", "Wandsworth Road Rail Station", "Wanstead Park Rail Station", "Wapping Rail Station", "Watford High Street Rail Station", "Watford Junction Rail Station", "Wembley Central Rail Station", "West Brompton Rail Station", "West Croydon Rail Station", "West Hampstead Rail Station", "White Hart Lane Rail Station", "Whitechapel Rail Station", "Willesden Junction Rail Station", "Wood Street Rail Station", "Woodgrange Park Rail Station"};
        String[] jubilee = {"Baker Street Underground Station", "Bermondsey Underground Station", "Bond Street Underground Station", "Canada Water Underground Station", "Canary Wharf Underground Station", "Canning Town Underground Station", "Canons Park Underground Station", "Dollis Hill Underground Station", "Finchley Road Underground Station", "Green Park Underground Station", "Kilburn Underground Station", "Kingsbury Underground Station", "London Bridge Underground Station", "Neasden Underground Station", "North Greenwich Underground Station", "Queensbury Underground Station", "Southwark Underground Station", "St. John's Wood Underground Station", "Stanmore Underground Station", "Stratford Underground Station", "Swiss Cottage Underground Station", "Waterloo Underground Station", "Wembley Park Underground Station", "West Ham Underground Station", "West Hampstead Underground Station", "Westminster Underground Station", "Willesden Green Underground Station "};
        String[] hammersmithAndCity = {"Aldgate East Underground Station", "Baker Street Underground Station", "Barbican Underground Station", "Barking Underground Station", "Bow Road Underground Station", "Bromley-by-Bow Underground Station", "East Ham Underground Station", "Edgware Road (Circle Line) Underground Station", "Euston Square Underground Station", "Farringdon Underground Station", "Goldhawk Road Underground Station", "Great Portland Street Underground Station", "Hammersmith (H&C Line) Underground Station", "King's Cross St. Pancras Underground Station", "Ladbroke Grove Underground Station", "Latimer Road Underground Station", "Liverpool Street Underground Station", "Mile End Underground Station", "Moorgate Underground Station", "Paddington (H&C Line)-Underground", "Plaistow Underground Station", "Royal Oak Underground Station", "Shepherd's Bush Market Underground Station", "Stepney Green Underground Station", "Upton Park Underground Station", "West Ham Underground Station", "Westbourne Park Underground Station", "Whitechapel Underground Station", "Wood Lane Underground Station"};
        String[] elizabeth = {"Abbey Wood", "Acton Main Line Rail Station", "Bond Street", "Brentwood Rail Station", "Burnham (Berks) Rail Station", "Canary Wharf", "Chadwell Heath Rail Station", "Custom House", "Ealing Broadway Rail Station", "Farringdon", "Forest Gate Rail Station", "Gidea Park Rail Station", "Goodmayes Rail Station", "Hanwell Rail Station", "Harold Wood Rail Station", "Hayes & Harlington Rail Station", "Heathrow Terminal 4 Rail Station", "Heathrow Terminal 5 Rail Station", "Heathrow Terminals 2 & 3 Rail Station", "Ilford Rail Station", "Iver Rail Station", "Langley (Berks) Rail Station", "Liverpool Street", "Maidenhead Rail Station", "Manor Park Rail Station", "Maryland Rail Station", "Paddington", "Reading Rail Station", "Romford Rail Station", "Seven Kings Rail Station", "Shenfield Rail Station", "Slough Rail Station", "Southall Rail Station", "Stratford (London) Rail Station", "Taplow Rail Station", "Tottenham Court Road", "Twyford Rail Station", "West Drayton Rail Station", "West Ealing Rail Station", "Whitechapel", "Woolwich"};
        String[] dlr = {"Abbey Road DLR Station", "All Saints DLR Station", "Bank DLR Station", "Beckton DLR Station", "Beckton Park DLR Station", "Blackwall DLR Station", "Bow Church DLR Station", "Canary Wharf DLR Station", "Canning Town DLR Station", "Crossharbour DLR Station", "Custom House (for ExCel) DLR Station", "Cutty Sark (for Maritime Greenwich) DLR Station", "Cyprus DLR Station", "Deptford Bridge DLR Station", "Devons Road DLR Station", "East India DLR Station", "Elverson Road DLR Station", "Gallions Reach DLR Station", "Greenwich DLR Station", "Heron Quays DLR Station", "Island Gardens DLR Station", "King George V DLR Station", "Langdon Park DLR Station", "Lewisham DLR Station", "Limehouse DLR Station", "London City Airport DLR Station", "Mudchute DLR Station", "Pontoon Dock DLR Station", "Poplar DLR Station", "Prince Regent DLR Station", "Pudding Mill Lane DLR Station", "Royal Albert DLR Station", "Royal Victoria DLR Station", "Shadwell DLR Station", "South Quay DLR Station", "Star Lane DLR Station", "Stratford DLR Station", "Stratford High Street DLR Station", "Stratford International DLR Station", "Tower Gateway DLR Station", "West Ham DLR Station", "West India Quay DLR Station", "West Silvertown DLR Station", "Westferry DLR Station", "Woolwich Arsenal DLR Station"};
        String[] district = {"Ealing Broadway Underground Station Jubilee", "Ealing Common Underground Station Metropolitan", "Acton Town Underground Station Piccadilly", "Chiswick Park Underground Station", "Turnham Green Underground Station", "Stamford Brook Underground Station", "Ravenscourt Park Underground Station", "Hammersmith (Dist&Picc Line) Underground Station", "Barons Court Underground Station", "West Kensington Underground Station", "Earl's Court Underground Station", "Gloucester Road Underground Station", "South Kensington Underground Station", "Sloane Square Underground Station", "Victoria Underground Station", "St. James's Park Underground Station", "Westminster Underground Station", "Embankment Underground Station", "Temple Underground Station", "Blackfriars Underground Station", "Mansion House Underground Station", "Cannon Street Underground Station", "Monument Underground Station", "Tower Hill Underground Station", "Aldgate East Underground Station", "Whitechapel Underground Station", "Stepney Green Underground Station", "Mile End Underground Station", "Bow Road Underground Station", "Bromley-by-Bow Underground Station", "West Ham Underground Station", "Plaistow Underground Station", "Upton Park Underground Station", "East Ham Underground Station", "Barking Underground Station", "Upney Underground Station", "Becontree Underground Station", "Dagenham Heathway Underground Station", "Dagenham East Underground Station", "Elm Park Underground Station", "Hornchurch Underground Station", "Upminster Bridge Underground Station", "Upminster Underground Station"};

        // storing tube lines names against station names as a map
        for (String s : bakerloo) {
            hmBakerloo.put(s, "Bakerloo line");
        }

//        for(Map.Entry<String,String> hm : hmBakerloo.entrySet()){
//            System.out.println(hm);
//        }
//        System.out.println("*********************");

        // storing tube lines against station names as a map
        for (String s : central) {
            hmCentral.put(s.toUpperCase(), "Central line");
        }

        // storing tube lines against station names as a map
        for (String s : circle) {
            hmCircle.put(s, "Circle line");
        }

        for (String s : waterlooAndCity) {
            hmWaterlooAndCity.put(s, "Waterloo & City line");
        }

        for (String s : tram) {
            hmTram.put(s, "Tram line");
        }

        for (String s : victoria) {
            hmVictoria.put(s, "Victoria line");
        }

        for (String s : piccadilly) {
            hmPiccadilly.put(s, "Piccadilly line");
        }

        for (String s : northern) {
            hmNorthern.put(s, "Northern line");
        }

        for (String s : metropolitan) {
            hmMetropolitan.put(s, "Metropolitan line");
        }

        for (String s : londonOverground) {
            hmLondonOverground.put(s, "London Overground line");
        }

        for (String s : jubilee) {
            hmJubilee.put(s, "Jubilee line");
        }

        for (String s : hammersmithAndCity) {
            hmHammersmithAndCity.put(s, "Hammersmith & City line");
        }

        for (String s : elizabeth) {
            hmElizabeth.put(s, "Elizabeth line");
        }

        for (String s : dlr) {
            hmDlr.put(s, "DLR line");
        }

        for (String s : district) {
            hmDistrict.put(s, "District line");
        }
    }

    public void printingLinesByStation(String stationName) {

        if (hmBakerloo.containsKey(stationName))
            passingByLines.add("Bakerloo line");
        if (hmCentral.containsKey(stationName))
            passingByLines.add("Central Line");
        if (hmCircle.containsKey(stationName))
            passingByLines.add("Circle line");
        if (hmWaterlooAndCity.containsKey(stationName))
            passingByLines.add("Waterloo & City line");
        if (hmTram.containsKey(stationName))
            passingByLines.add("Tram line");
        if (hmVictoria.containsKey(stationName))
            passingByLines.add("Victoria line");
        if (hmPiccadilly.containsKey(stationName))
            passingByLines.add("Piccadilly line");
        if (hmNorthern.containsKey(stationName))
            passingByLines.add("Northern line");
        if (hmMetropolitan.containsKey(stationName))
            passingByLines.add("Metropolitan line");
        if (hmLondonOverground.containsKey(stationName))
            passingByLines.add("London Overground line");
        if (hmJubilee.containsKey(stationName))
            passingByLines.add("Jubilee line");
        if (hmHammersmithAndCity.containsKey(stationName))
            passingByLines.add("Hammersmith & City line");
        if (hmElizabeth.containsKey(stationName))
            passingByLines.add("Elizabeth line");
        if (hmDlr.containsKey(stationName))
            passingByLines.add("DLR line");
        if (hmDistrict.containsKey(stationName))
            passingByLines.add("District line");
        System.out.println("Station name: " + stationName + " Tube services available :" + passingByLines);
        passingByLines.clear();
    }

    public static void main(String[] args) {
        Programme10_FindTubesByStationName abc = new Programme10_FindTubesByStationName();
        abc.stationListForTube();
        String[] stationTestData = {"Euston Underground Station", "Victoria Underground Station", "Piccadilly Circus Underground Station","Leicester Square Underground Station"};
        for (String str : stationTestData) {
            abc.printingLinesByStation(str);
        }
    }

}