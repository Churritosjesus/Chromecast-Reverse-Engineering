.class final Larf;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Landroid/widget/CheckBox;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/ImageView;

.field e:Laex;


# direct methods
.method constructor <init>(Lard;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    sget v0, Lf;->Y:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Larf;->a:Landroid/widget/CheckBox;

    .line 65
    sget v0, Lf;->k:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Larf;->b:Landroid/widget/TextView;

    .line 66
    sget v0, Lf;->i:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Larf;->c:Landroid/widget/TextView;

    .line 67
    sget v0, Lf;->j:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Larf;->d:Landroid/widget/ImageView;

    .line 68
    return-void
.end method
