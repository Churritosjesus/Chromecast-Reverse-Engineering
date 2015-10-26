.class public final Laas;
.super Lmk;
.source "PG"


# instance fields
.field public b:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .prologue
    const/4 v0, -0x2

    .line 1805
    invoke-direct {p0, v0, v0}, Lmk;-><init>(II)V

    .line 1798
    const/4 v0, 0x0

    iput v0, p0, Laas;->b:I

    .line 1806
    const v0, 0x800013

    iput v0, p0, Laas;->a:I

    .line 1807
    return-void
.end method

.method public constructor <init>(Laas;)V
    .locals 1

    .prologue
    .line 1819
    invoke-direct {p0, p1}, Lmk;-><init>(Lmk;)V

    .line 1798
    const/4 v0, 0x0

    iput v0, p0, Laas;->b:I

    .line 1821
    iget v0, p1, Laas;->b:I

    iput v0, p0, Laas;->b:I

    .line 1822
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 1801
    invoke-direct {p0, p1, p2}, Lmk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1798
    const/4 v0, 0x0

    iput v0, p0, Laas;->b:I

    .line 1802
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 1836
    invoke-direct {p0, p1}, Lmk;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1798
    const/4 v0, 0x0

    iput v0, p0, Laas;->b:I

    .line 1837
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    .prologue
    .line 1829
    invoke-direct {p0, p1}, Lmk;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1798
    const/4 v0, 0x0

    iput v0, p0, Laas;->b:I

    .line 2840
    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v0, p0, Laas;->leftMargin:I

    .line 2841
    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, p0, Laas;->topMargin:I

    .line 2842
    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, p0, Laas;->rightMargin:I

    .line 2843
    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v0, p0, Laas;->bottomMargin:I

    .line 1833
    return-void
.end method

.method public constructor <init>(Lmk;)V
    .locals 1

    .prologue
    .line 1825
    invoke-direct {p0, p1}, Lmk;-><init>(Lmk;)V

    .line 1798
    const/4 v0, 0x0

    iput v0, p0, Laas;->b:I

    .line 1826
    return-void
.end method
