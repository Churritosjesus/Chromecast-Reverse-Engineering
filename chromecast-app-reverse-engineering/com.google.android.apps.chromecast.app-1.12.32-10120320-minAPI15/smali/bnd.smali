.class final Lbnd;
.super Landroid/widget/ArrayAdapter;
.source "PG"


# instance fields
.field final synthetic a:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Landroid/content/Context;ILjava/util/List;)V
    .locals 0

    .prologue
    .line 1094
    iput-object p1, p0, Lbnd;->a:Lbmu;

    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 1097
    iget-object v0, p0, Lbnd;->a:Lbmu;

    .line 2069
    iget-object v0, v0, Lbmu;->d:Ljava/util/List;

    .line 1097
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Last;

    .line 1098
    if-nez p2, :cond_0

    .line 1099
    iget-object v1, p0, Lbnd;->a:Lbmu;

    .line 3069
    iget-object v1, v1, Lbmu;->h:Landroid/content/Context;

    .line 1099
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->fx:I

    const/4 v3, 0x0

    .line 1100
    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 1102
    :cond_0
    sget v1, Lf;->aE:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 3074
    iget-object v2, v0, Last;->c:Ljava/lang/String;

    .line 1102
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1103
    sget v1, Lf;->h:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lbnd;->a:Lbmu;

    .line 4069
    iget-object v2, v2, Lbmu;->h:Landroid/content/Context;

    .line 1104
    sget v3, Lb;->O:I

    new-array v4, v9, [Ljava/lang/Object;

    iget-object v5, p0, Lbnd;->a:Lbmu;

    .line 5069
    iget-object v5, v5, Lbmu;->h:Landroid/content/Context;

    .line 1105
    invoke-static {v5}, Landroid/text/format/DateFormat;->getDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v5

    .line 6054
    iget-wide v6, v0, Last;->d:J

    .line 1105
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v8

    .line 1104
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1103
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1106
    sget v1, Lf;->er:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 1107
    iget-object v2, p0, Lbnd;->a:Lbmu;

    .line 6069
    iget-object v2, v2, Lbmu;->h:Landroid/content/Context;

    .line 1107
    sget v3, Lb;->ak:I

    new-array v4, v9, [Ljava/lang/Object;

    .line 6074
    iget-object v5, v0, Last;->c:Ljava/lang/String;

    .line 1108
    aput-object v5, v4, v8

    .line 1107
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1110
    new-instance v1, Lbne;

    invoke-direct {v1, p0, v0}, Lbne;-><init>(Lbnd;Last;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1117
    return-object p2
.end method
