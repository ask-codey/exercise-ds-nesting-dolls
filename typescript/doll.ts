// One doll in a set. inside is the doll inside this one, or null when this
// doll is solid. You don't need to change this class.
export class Doll {
  color: string;
  inside: Doll | null;

  constructor(color: string, inside: Doll | null) {
    this.color = color;
    this.inside = inside;
  }
}
