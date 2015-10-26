.class public final Lbgo;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private Z:Lbjn;

.field public a:Landroid/widget/CheckBox;

.field public b:Landroid/widget/CheckBox;

.field private c:Landroid/widget/EditText;

.field private d:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lj;-><init>()V

    .line 98
    return-void
.end method

.method public static a(Z)Lbgo;
    .locals 3

    .prologue
    .line 41
    new-instance v0, Lbgo;

    invoke-direct {v0}, Lbgo;-><init>()V

    .line 42
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 43
    const-string v2, "supportsGetLicense"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 44
    invoke-virtual {v0, v1}, Lbgo;->f(Landroid/os/Bundle;)V

    .line 45
    return-object v0
.end method

.method static synthetic a(Lbgo;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lbgo;->q()V

    return-void
.end method

.method private q()V
    .locals 2

    .prologue
    .line 171
    iget-object v1, p0, Lbgo;->d:Landroid/widget/Button;

    invoke-virtual {p0}, Lbgo;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 172
    return-void

    .line 171
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 63
    sget v0, La;->fK:I

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 64
    sget v0, Lf;->cf:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v4, Lb;->bN:I

    new-array v5, v1, [Ljava/lang/Object;

    iget-object v6, p0, Lbgo;->Z:Lbjn;

    .line 65
    invoke-interface {v6}, Lbjn;->E()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {p0, v4, v5}, Lbgo;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 64
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    sget v0, Lf;->aa:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lbgo;->d:Landroid/widget/Button;

    .line 67
    iget-object v0, p0, Lbgo;->d:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    sget v0, Lf;->ar:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lbgo;->c:Landroid/widget/EditText;

    .line 69
    iget-object v0, p0, Lbgo;->c:Landroid/widget/EditText;

    new-instance v4, Lbgp;

    invoke-direct {v4, p0}, Lbgp;-><init>(Lbgo;)V

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 84
    iget-object v0, p0, Lbgo;->c:Landroid/widget/EditText;

    iget-object v4, p0, Lbgo;->Z:Lbjn;

    invoke-interface {v4}, Lbjn;->D()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 85
    iget-object v0, p0, Lbgo;->Z:Lbjn;

    invoke-interface {v0}, Lbjn;->F()Lbdf;

    move-result-object v0

    invoke-virtual {v0}, Lbdf;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 86
    invoke-static {v0}, Lblf;->K(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2612
    iget-object v0, p0, Lj;->y:Lm;

    .line 87
    invoke-static {v0}, Lblf;->M(Landroid/content/Context;)Lblg;

    move-result-object v4

    .line 88
    sget-object v0, Lbgq;->a:[I

    invoke-virtual {v4}, Lblg;->ordinal()I

    move-result v5

    aget v0, v0, v5

    packed-switch v0, :pswitch_data_0

    .line 98
    sget v0, Lf;->cA:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v4, 0x8

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 101
    :cond_0
    :goto_0
    sget v0, Lf;->ea:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lbgo;->b:Landroid/widget/CheckBox;

    .line 103
    sget-object v0, Lbgq;->b:[I

    .line 3612
    iget-object v4, p0, Lj;->y:Lm;

    .line 103
    invoke-static {v4}, Lblf;->N(Landroid/content/Context;)I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    aget v0, v0, v4

    packed-switch v0, :pswitch_data_1

    .line 113
    iget-object v0, p0, Lbgo;->Z:Lbjn;

    invoke-interface {v0}, Lbjn;->F()Lbdf;

    move-result-object v0

    .line 3692
    iget-boolean v2, v0, Lbdf;->O:Z

    .line 116
    :goto_1
    :pswitch_0
    iget-object v0, p0, Lbgo;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 117
    invoke-virtual {p0, v1}, Lbgo;->d(Z)V

    .line 118
    return-object v3

    .line 91
    :pswitch_1
    sget v0, Lf;->cA:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 92
    sget v0, Lf;->cz:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lbgo;->a:Landroid/widget/CheckBox;

    .line 93
    iget-object v5, p0, Lbgo;->a:Landroid/widget/CheckBox;

    sget-object v0, Lblg;->b:Lblg;

    if-ne v4, v0, :cond_1

    move v0, v1

    .line 94
    :goto_2
    invoke-virtual {v5, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    :cond_1
    move v0, v2

    .line 93
    goto :goto_2

    :pswitch_2
    move v2, v1

    .line 106
    goto :goto_1

    .line 88
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 103
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 56
    invoke-super {p0}, Lj;->a()V

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lbgo;->Z:Lbjn;

    .line 58
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 50
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 51
    check-cast p1, Lbjn;

    iput-object p1, p0, Lbgo;->Z:Lbjn;

    .line 52
    return-void
.end method

.method public final a(Landroid/view/Menu;)V
    .locals 2

    .prologue
    .line 129
    invoke-super {p0, p1}, Lj;->a(Landroid/view/Menu;)V

    .line 4559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 130
    const-string v1, "supportsGetLicense"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 131
    sget v0, Lf;->bM:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 133
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    .prologue
    .line 123
    invoke-super {p0, p1, p2}, Lj;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 124
    sget v0, La;->gX:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 125
    return-void
.end method

.method public final j()V
    .locals 0

    .prologue
    .line 137
    invoke-super {p0}, Lj;->j()V

    .line 138
    invoke-direct {p0}, Lbgo;->q()V

    .line 139
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 146
    iget-object v0, p0, Lbgo;->d:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 5612
    iget-object v0, p0, Lj;->y:Lm;

    .line 5176
    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Lm;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 6612
    iget-object v1, p0, Lj;->y:Lm;

    .line 5177
    invoke-virtual {v1}, Lm;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 5178
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    .line 5177
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 148
    iget-object v0, p0, Lbgo;->Z:Lbjn;

    sget v1, Lbjo;->d:I

    invoke-interface {v0, v1}, Lbjn;->a(I)V

    .line 150
    :cond_0
    return-void
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lbgo;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
