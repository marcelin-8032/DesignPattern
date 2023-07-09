package com.design.pattern.behavioral.iterator.name;

public class CollectionsOfNames implements Container {

    String name[] = {"Mohsen D", "Soono Red", "Rishi patil", "Andre giant", "Iron Sheick"};


    @Override
    public Iterator getIterator() {
        return new CollectionsOfNamesIterat();
    }

    private class CollectionsOfNamesIterat implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[i++];
            }
            return null;
        }
    }
}
