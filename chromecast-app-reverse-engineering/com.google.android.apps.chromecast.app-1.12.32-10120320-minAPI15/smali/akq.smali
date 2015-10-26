.class public final Lakq;
.super Lj;
.source "PG"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lakh;

.field private c:Lakl;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method

.method static a(Lakl;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 181
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 182
    const-string v1, "request"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 183
    return-object v0
.end method

.method static synthetic a(Lakq;Lakn;)V
    .locals 3

    .prologue
    .line 43
    .line 8117
    const/4 v0, 0x0

    iput-object v0, p0, Lakq;->c:Lakl;

    .line 8119
    iget-object v0, p1, Lakn;->a:Lakp;

    sget-object v1, Lakp;->b:Lakp;

    if-ne v0, v1, :cond_1

    .line 8120
    const/4 v0, 0x0

    .line 8122
    :goto_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 8123
    const-string v2, "com.facebook.LoginFragment:Result"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 8125
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 8126
    invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 8129
    invoke-virtual {p0}, Lakq;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8612
    iget-object v1, p0, Lj;->y:Lm;

    .line 8130
    invoke-virtual {v1, v0, v2}, Lm;->setResult(ILandroid/content/Intent;)V

    .line 9612
    iget-object v0, p0, Lj;->y:Lm;

    .line 8131
    invoke-virtual {v0}, Lm;->finish()V

    .line 43
    :cond_0
    return-void

    .line 8120
    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 96
    sget v0, La;->cZ:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 98
    iget-object v1, p0, Lakq;->b:Lakh;

    new-instance v2, Laks;

    invoke-direct {v2, p0, v0}, Laks;-><init>(Lakq;Landroid/view/View;)V

    .line 3310
    iput-object v2, v1, Lakh;->e:Lakj;

    .line 113
    return-object v0
.end method

.method public final a(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 161
    invoke-super {p0, p1, p2, p3}, Lj;->a(IILandroid/content/Intent;)V

    .line 162
    iget-object v0, p0, Lakq;->b:Lakh;

    .line 7149
    iget-object v1, v0, Lakh;->f:Lakl;

    if-eqz v1, :cond_0

    .line 7150
    invoke-virtual {v0}, Lakh;->c()Laky;

    move-result-object v0

    .line 7151
    invoke-virtual {v0, p2, p3}, Laky;->a(ILandroid/content/Intent;)Z

    .line 163
    :cond_0
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 59
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 61
    if-eqz p1, :cond_2

    .line 62
    const-string v0, "loginClient"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lakh;

    iput-object v0, p0, Lakq;->b:Lakh;

    .line 63
    iget-object v0, p0, Lakq;->b:Lakh;

    .line 1087
    iget-object v1, v0, Lakh;->c:Lj;

    if-eqz v1, :cond_0

    .line 1088
    new-instance v0, Lafq;

    const-string v1, "Can\'t set fragment once it is already set."

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1090
    :cond_0
    iput-object p0, v0, Lakh;->c:Lj;

    .line 68
    :goto_0
    iget-object v0, p0, Lakq;->b:Lakh;

    new-instance v1, Lakr;

    invoke-direct {v1, p0}, Lakr;-><init>(Lakq;)V

    .line 1300
    iput-object v1, v0, Lakh;->d:Lakk;

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 76
    if-nez v0, :cond_3

    .line 85
    :cond_1
    :goto_1
    return-void

    .line 65
    :cond_2
    new-instance v0, Lakh;

    invoke-direct {v0, p0}, Lakh;-><init>(Lj;)V

    iput-object v0, p0, Lakq;->b:Lakh;

    goto :goto_0

    .line 2173
    :cond_3
    invoke-virtual {v0}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v1

    .line 2174
    if-eqz v1, :cond_4

    .line 2177
    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lakq;->a:Ljava/lang/String;

    .line 81
    :cond_4
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 83
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "request"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lakl;

    iput-object v0, p0, Lakq;->c:Lakl;

    goto :goto_1
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 167
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 169
    const-string v0, "loginClient"

    iget-object v1, p0, Lakq;->b:Lakh;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 170
    return-void
.end method

.method public final j()V
    .locals 4

    .prologue
    .line 137
    invoke-super {p0}, Lj;->j()V

    .line 142
    iget-object v0, p0, Lakq;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 143
    const-string v0, "LoginFragment"

    const-string v1, "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 3612
    iget-object v0, p0, Lj;->y:Lm;

    .line 144
    invoke-virtual {v0}, Lm;->finish()V

    .line 149
    :cond_0
    :goto_0
    return-void

    .line 148
    :cond_1
    iget-object v1, p0, Lakq;->b:Lakh;

    iget-object v2, p0, Lakq;->c:Lakl;

    .line 4131
    iget-object v0, v1, Lakh;->f:Lakl;

    if-eqz v0, :cond_2

    iget v0, v1, Lakh;->b:I

    if-ltz v0, :cond_2

    const/4 v0, 0x1

    .line 4107
    :goto_1
    if-nez v0, :cond_0

    .line 5113
    if-eqz v2, :cond_0

    .line 5117
    iget-object v0, v1, Lakh;->f:Lakl;

    if-eqz v0, :cond_3

    .line 5118
    new-instance v0, Lafq;

    const-string v1, "Attempted to authorize while a request is pending."

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4131
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 5121
    :cond_3
    invoke-static {}, Lafb;->a()Lafb;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Lakh;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5125
    :cond_4
    iput-object v2, v1, Lakh;->f:Lakl;

    .line 5157
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5458
    iget-object v2, v2, Lakl;->a:Lakg;

    .line 6053
    iget-boolean v3, v2, Lakg;->b:Z

    .line 5161
    if-eqz v3, :cond_5

    .line 5162
    new-instance v3, Laka;

    invoke-direct {v3, v1}, Laka;-><init>(Lakh;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5163
    new-instance v3, Lake;

    invoke-direct {v3, v1}, Lake;-><init>(Lakh;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6057
    :cond_5
    iget-boolean v2, v2, Lakg;->c:Z

    .line 5166
    if-eqz v2, :cond_6

    .line 5167
    new-instance v2, Lalb;

    invoke-direct {v2, v1}, Lalb;-><init>(Lakh;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5170
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Laky;

    .line 5171
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 5126
    iput-object v2, v1, Lakh;->a:[Laky;

    .line 5127
    invoke-virtual {v1}, Lakh;->e()V

    goto :goto_0
.end method

.method public final k()V
    .locals 2

    .prologue
    .line 153
    invoke-super {p0}, Lj;->k()V

    .line 6612
    iget-object v0, p0, Lj;->y:Lm;

    .line 155
    sget v1, La;->cX:I

    invoke-virtual {v0, v1}, Lm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 157
    return-void
.end method

.method public final l()V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lakq;->b:Lakh;

    .line 3135
    iget v1, v0, Lakh;->b:I

    if-ltz v1, :cond_0

    .line 3136
    invoke-virtual {v0}, Lakh;->c()Laky;

    move-result-object v0

    invoke-virtual {v0}, Laky;->b()V

    .line 90
    :cond_0
    invoke-super {p0}, Lj;->l()V

    .line 91
    return-void
.end method
