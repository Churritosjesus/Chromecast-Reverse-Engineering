.class final Lbnb;
.super Landroid/widget/ArrayAdapter;
.source "PG"


# instance fields
.field final synthetic a:Lbny;

.field final synthetic b:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Landroid/content/Context;ILjava/util/List;Lbny;)V
    .locals 0

    .prologue
    .line 1057
    iput-object p1, p0, Lbnb;->b:Lbmu;

    iput-object p5, p0, Lbnb;->a:Lbny;

    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 1060
    iget-object v0, p0, Lbnb;->b:Lbmu;

    .line 2069
    iget-object v0, v0, Lbmu;->c:Ljava/util/List;

    .line 1060
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 1061
    if-nez p2, :cond_0

    .line 1062
    iget-object v1, p0, Lbnb;->b:Lbmu;

    .line 3069
    iget-object v1, v1, Lbmu;->h:Landroid/content/Context;

    .line 1062
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->gc:I

    const/4 v3, 0x0

    .line 1063
    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 1065
    :cond_0
    sget v1, Lf;->aE:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v0}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1066
    new-instance v1, Lbnc;

    invoke-direct {v1, p0, v0}, Lbnc;-><init>(Lbnb;Laow;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1072
    return-object p2
.end method
