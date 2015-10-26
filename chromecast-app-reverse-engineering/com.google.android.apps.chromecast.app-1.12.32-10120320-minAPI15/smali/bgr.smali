.class public final Lbgr;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public a:Lbos;

.field private b:Lbjn;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method

.method public static a(Lbfs;Z)Lbgr;
    .locals 3

    .prologue
    .line 38
    new-instance v0, Lbgr;

    invoke-direct {v0}, Lbgr;-><init>()V

    .line 39
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 40
    const-string v2, "androidWifiNetwork"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 41
    const-string v2, "supporteGetLicense"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 42
    invoke-virtual {v0, v1}, Lbgr;->f(Landroid/os/Bundle;)V

    .line 43
    return-object v0
.end method

.method static synthetic a(Lbgr;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lbgr;->p()V

    return-void
.end method

.method private p()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 137
    iget-object v1, p0, Lbgr;->d:Landroid/widget/Button;

    iget-object v2, p0, Lbgr;->a:Lbos;

    .line 7181
    invoke-virtual {v2}, Lbos;->a()Lbfs;

    move-result-object v3

    .line 7182
    if-eqz v3, :cond_0

    .line 8130
    iget-object v4, v3, Lbfs;->a:Ljava/lang/String;

    .line 7182
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 137
    :cond_0
    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 138
    return-void

    .line 8138
    :cond_1
    iget-object v3, v3, Lbfs;->b:Lbfu;

    .line 7185
    iget-boolean v3, v3, Lbfu;->k:Z

    if-eqz v3, :cond_2

    iget-object v2, v2, Lbos;->b:Landroid/widget/EditText;

    .line 7186
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 7189
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 62
    sget v0, La;->fL:I

    invoke-virtual {p1, v0, p2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 64
    new-instance v2, Lbos;

    sget v0, Lf;->ad:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-direct {v2, v0}, Lbos;-><init>(Landroid/view/ViewGroup;)V

    iput-object v2, p0, Lbgr;->a:Lbos;

    .line 65
    iget-object v0, p0, Lbgr;->a:Lbos;

    new-instance v2, Lbgs;

    invoke-direct {v2, p0}, Lbgs;-><init>(Lbgr;)V

    .line 1168
    iput-object v2, v0, Lbos;->a:Lboz;

    .line 72
    sget v0, Lf;->aD:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbgr;->c:Landroid/widget/TextView;

    .line 73
    sget v0, Lf;->bi:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lbgr;->d:Landroid/widget/Button;

    .line 74
    iget-object v0, p0, Lbgr;->d:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 76
    const-string v2, "androidWifiNetwork"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 2121
    if-eqz v0, :cond_0

    .line 2122
    iget-object v2, p0, Lbgr;->a:Lbos;

    iget-object v3, p0, Lbgr;->b:Lbjn;

    invoke-interface {v3}, Lbjn;->u()Ljava/util/List;

    move-result-object v3

    .line 3130
    iget-object v4, v0, Lbfs;->a:Ljava/lang/String;

    .line 3138
    iget-object v5, v0, Lbfs;->b:Lbfu;

    .line 3178
    iget-boolean v0, v0, Lbfs;->g:Z

    .line 2122
    invoke-virtual {v2, v3, v4, v5, v0}, Lbos;->a(Ljava/util/List;Ljava/lang/String;Lbfu;Z)V

    .line 2128
    :goto_0
    iget-object v0, p0, Lbgr;->b:Lbjn;

    invoke-interface {v0}, Lbjn;->F()Lbdf;

    move-result-object v0

    .line 3382
    iget-object v0, v0, Lbdf;->p:Ljava/lang/String;

    .line 2128
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2129
    iget-object v0, p0, Lbgr;->c:Landroid/widget/TextView;

    sget v2, Lb;->aV:I

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lbgr;->b:Lbjn;

    .line 2130
    invoke-interface {v4}, Lbjn;->F()Lbdf;

    move-result-object v4

    .line 4382
    iget-object v4, v4, Lbdf;->p:Ljava/lang/String;

    .line 2130
    aput-object v4, v3, v6

    .line 2129
    invoke-virtual {p0, v2, v3}, Lbgr;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    :goto_1
    invoke-virtual {p0, v7}, Lbgr;->d(Z)V

    .line 78
    return-object v1

    .line 2126
    :cond_0
    iget-object v0, p0, Lbgr;->a:Lbos;

    iget-object v2, p0, Lbgr;->b:Lbjn;

    invoke-interface {v2}, Lbjn;->u()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2, v3, v3, v6}, Lbos;->a(Ljava/util/List;Ljava/lang/String;Lbfu;Z)V

    goto :goto_0

    .line 2132
    :cond_1
    iget-object v0, p0, Lbgr;->c:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 54
    invoke-super {p0}, Lj;->a()V

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lbgr;->b:Lbjn;

    .line 56
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 48
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 49
    check-cast p1, Lbjn;

    iput-object p1, p0, Lbgr;->b:Lbjn;

    .line 50
    return-void
.end method

.method public final a(Landroid/view/Menu;)V
    .locals 2

    .prologue
    .line 89
    invoke-super {p0, p1}, Lj;->a(Landroid/view/Menu;)V

    .line 4559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 90
    const-string v1, "supporteGetLicense"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    sget v0, Lf;->bM:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 93
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    .prologue
    .line 83
    invoke-super {p0, p1, p2}, Lj;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 84
    sget v0, La;->gX:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 85
    return-void
.end method

.method public final j()V
    .locals 0

    .prologue
    .line 97
    invoke-super {p0}, Lj;->j()V

    .line 99
    invoke-direct {p0}, Lbgr;->p()V

    .line 100
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 107
    iget-object v0, p0, Lbgr;->d:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 5612
    iget-object v0, p0, Lj;->y:Lm;

    .line 5142
    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Lm;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 6612
    iget-object v1, p0, Lj;->y:Lm;

    .line 5143
    invoke-virtual {v1}, Lm;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 5144
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    .line 5143
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 109
    iget-object v0, p0, Lbgr;->b:Lbjn;

    sget v1, Lbjo;->e:I

    invoke-interface {v0, v1}, Lbjn;->a(I)V

    .line 111
    :cond_0
    return-void
.end method
