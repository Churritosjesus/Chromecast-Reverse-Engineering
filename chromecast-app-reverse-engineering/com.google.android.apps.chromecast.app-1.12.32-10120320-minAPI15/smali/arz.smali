.class final Larz;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/widget/ImageView;

.field final b:Landroid/widget/ImageView;

.field final c:Landroid/widget/TextView;

.field final d:Landroid/widget/TextView;

.field final e:Landroid/widget/TextView;

.field final f:Landroid/widget/TextView;

.field g:Laex;

.field h:Laex;

.field final synthetic i:Lart;


# direct methods
.method public constructor <init>(Lart;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 341
    iput-object p1, p0, Larz;->i:Lart;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 342
    sget v0, Lf;->G:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Larz;->a:Landroid/widget/ImageView;

    .line 343
    sget v0, Lf;->bI:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Larz;->b:Landroid/widget/ImageView;

    .line 344
    sget v0, Lf;->ah:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Larz;->f:Landroid/widget/TextView;

    .line 345
    sget v0, Lf;->ae:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Larz;->c:Landroid/widget/TextView;

    .line 346
    sget v0, Lf;->af:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Larz;->d:Landroid/widget/TextView;

    .line 347
    sget v0, Lf;->ag:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Larz;->e:Landroid/widget/TextView;

    .line 348
    return-void
.end method
