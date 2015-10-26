.class public final Lbgv;
.super Li;
.source "PG"


# instance fields
.field private Z:Landroid/widget/Spinner;

.field private aa:Ljava/lang/String;

.field private ab:Lbgz;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Li;-><init>()V

    .line 27
    return-void
.end method

.method static synthetic a(Lbgv;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lbgv;->aa:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lbgv;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lbgv;->aa:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lbgv;)Lbgz;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lbgv;->ab:Lbgz;

    return-object v0
.end method

.method static synthetic c(Lbgv;)Landroid/widget/Spinner;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lbgv;->Z:Landroid/widget/Spinner;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 47
    invoke-super {p0}, Li;->a()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lbgv;->ab:Lbgz;

    .line 49
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 41
    invoke-super {p0, p1}, Li;->a(Landroid/app/Activity;)V

    .line 42
    check-cast p1, Lbgz;

    iput-object p1, p0, Lbgv;->ab:Lbgz;

    .line 43
    return-void
.end method

.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    .prologue
    .line 53
    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 54
    invoke-virtual {v0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->gM:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 55
    sget v0, Lf;->bY:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v2, Lb;->cU:I

    .line 56
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 57
    sget v0, Lf;->aN:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lbgv;->Z:Landroid/widget/Spinner;

    .line 58
    if-eqz p1, :cond_0

    .line 59
    const-string v0, "setupCountry"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbgv;->aa:Ljava/lang/String;

    .line 2083
    :cond_0
    invoke-static {}, Lblj;->e()Ljava/util/List;

    move-result-object v2

    .line 2084
    new-instance v3, Landroid/widget/ArrayAdapter;

    .line 2612
    iget-object v0, p0, Lj;->y:Lm;

    .line 2084
    const v4, 0x1090008

    invoke-direct {v3, v0, v4, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 2086
    const v0, 0x1090009

    invoke-virtual {v3, v0}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 2088
    iget-object v0, p0, Lbgv;->Z:Landroid/widget/Spinner;

    invoke-virtual {v0, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 2090
    iget-object v0, p0, Lbgv;->aa:Ljava/lang/String;

    invoke-static {v2, v0}, Lblj;->a(Ljava/util/List;Ljava/lang/String;)Lblm;

    move-result-object v0

    .line 2091
    if-nez v0, :cond_1

    .line 2093
    invoke-static {v2}, Lblj;->a(Ljava/util/List;)Lblm;

    move-result-object v0

    .line 2095
    :cond_1
    if-eqz v0, :cond_2

    .line 2096
    invoke-virtual {v3, v0}, Landroid/widget/ArrayAdapter;->getPosition(Ljava/lang/Object;)I

    move-result v0

    .line 2097
    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    .line 2098
    iget-object v2, p0, Lbgv;->Z:Landroid/widget/Spinner;

    invoke-virtual {v2, v0}, Landroid/widget/Spinner;->setSelection(I)V

    .line 2101
    :cond_2
    iget-object v0, p0, Lbgv;->Z:Landroid/widget/Spinner;

    new-instance v2, Lbgy;

    invoke-direct {v2, p0}, Lbgy;-><init>(Lbgv;)V

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 63
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 3612
    iget-object v2, p0, Lj;->y:Lm;

    .line 63
    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v2, Lb;->cV:I

    .line 64
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 65
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->H:I

    new-instance v2, Lbgx;

    invoke-direct {v2, p0}, Lbgx;-><init>(Lbgv;)V

    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->I:I

    new-instance v2, Lbgw;

    invoke-direct {v2, p0}, Lbgw;-><init>(Lbgv;)V

    .line 73
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 118
    invoke-super {p0, p1}, Li;->e(Landroid/os/Bundle;)V

    .line 119
    const-string v0, "setupCountry"

    iget-object v1, p0, Lbgv;->aa:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 124
    invoke-super {p0, p1}, Li;->onCancel(Landroid/content/DialogInterface;)V

    .line 125
    iget-object v0, p0, Lbgv;->ab:Lbgz;

    invoke-interface {v0}, Lbgz;->a()V

    .line 126
    return-void
.end method
