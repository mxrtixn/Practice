#Exercice 1:

def reverse_liste(liste, element):
    liste.append(element)

    print("--------------------------------->    Votre liste : ", liste, "    <----------------------------------")

    liste.sort(reverse=True)
    print("--------------------------------->    Votre liste inversée : ", liste, "    <----------------------------------")

def paires_seulement():
    pass
                


def main():
    liste = []
    print("Entrez vos elements (tapez 'arret' pour terminer) :      ")

    while True:
        element = input("> ")
        if element.lower() == 'arret':
            break
        else:
            reverse_liste(liste, element) 

main 