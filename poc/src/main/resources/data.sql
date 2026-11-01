INSERT INTO vraag (tekst, volgorde) VALUES
                                        ('Testvraag 1', 1), ('Testvraag 2', 2), ('Testvraag 3', 3),
                                        ('Testvraag 4', 4), ('Testvraag 5', 5), ('Testvraag 6', 6),
                                        ('Testvraag 7', 7), ('Testvraag 8', 8), ('Testvraag 9', 9),
                                        ('Testvraag 10', 10), ('Testvraag 11', 11);

INSERT INTO antwoordoptie (vraag_id, tekst)
SELECT id, 'Ja' FROM vraag
UNION ALL
SELECT id, 'Nee' FROM vraag;