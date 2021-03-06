package ceedubs.irrec

import higherkindness.droste.data.Coattr

package object regex {
  type Kleene[A] = Coattr[KleeneF, A]
  type Regex[A] = Kleene[Match[A]]

  implicit def toKleeneOps[A](r: Kleene[A]): KleeneOps[A] = new KleeneOps(r)

  implicit def toRegexOps[A](r: Regex[A]): RegexOps[A] = new RegexOps(r)

  implicit def toCharRegexOps(r: Regex[Char]): CharRegexOps = new CharRegexOps(r)
}
