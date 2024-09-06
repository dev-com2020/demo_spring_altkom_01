Feature: Zarządzanie wideo
  Scenario: Pobieranie wszystkich filmów
    Given istnieją filmy w bazie danych
    When wysyłam żądanie GET na /api/videos
    Then otrzymuję listę filmów

#    Scenario: Dodawanie nowego filmu
#      Given nie ma filmu o tytule "Nowy film"
#      When wysyłam żądanie POST na "/api/videos" z nowym filmem
#      Then film o tytule "Nowy film" jest zapisany w bazie danych