.class public final Lain;
.super Li;
.source "PG"


# instance fields
.field public Z:Landroid/app/Dialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Li;-><init>()V

    return-void
.end method

.method static synthetic a(Lain;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 40
    .line 6612
    iget-object v0, p0, Lj;->y:Lm;

    .line 6155
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 6156
    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 6158
    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Lm;->setResult(ILandroid/content/Intent;)V

    .line 6159
    invoke-virtual {v0}, Lm;->finish()V

    .line 40
    return-void
.end method

.method static synthetic a(Lain;Landroid/os/Bundle;Lafq;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1, p2}, Lain;->a(Landroid/os/Bundle;Lafq;)V

    return-void
.end method

.method private a(Landroid/os/Bundle;Lafq;)V
    .locals 3

    .prologue
    .line 139
    .line 5612
    iget-object v1, p0, Lj;->y:Lm;

    .line 142
    invoke-virtual {v1}, Lm;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 141
    invoke-static {v0, p1, p2}, Laix;->a(Landroid/content/Intent;Landroid/os/Bundle;Lafq;)Landroid/content/Intent;

    move-result-object v2

    .line 146
    if-nez p2, :cond_0

    const/4 v0, -0x1

    .line 148
    :goto_0
    invoke-virtual {v1, v0, v2}, Lm;->setResult(ILandroid/content/Intent;)V

    .line 149
    invoke-virtual {v1}, Lm;->finish()V

    .line 150
    return-void

    .line 146
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 55
    invoke-super {p0, p1}, Li;->a(Landroid/os/Bundle;)V

    .line 57
    iget-object v0, p0, Lain;->Z:Landroid/app/Dialog;

    if-nez v0, :cond_0

    .line 1612
    iget-object v1, p0, Lj;->y:Lm;

    .line 59
    invoke-virtual {v1}, Lm;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 60
    invoke-static {v0}, Laix;->a(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    .line 62
    const-string v2, "is_fallback"

    invoke-virtual {v0, v2, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 64
    if-nez v2, :cond_2

    .line 65
    const-string v2, "action"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 66
    const-string v3, "params"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 67
    invoke-static {v2}, Laji;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 68
    const-string v0, "FacebookDialogFragment"

    const-string v2, "Cannot start a WebDialog with an empty/missing \'actionName\'"

    invoke-static {v0, v2}, Laji;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-virtual {v1}, Lm;->finish()V

    .line 108
    :cond_0
    :goto_0
    return-void

    .line 75
    :cond_1
    new-instance v3, Lajv;

    invoke-direct {v3, v1, v2, v0}, Lajv;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v0, Laio;

    invoke-direct {v0, p0}, Laio;-><init>(Lain;)V

    .line 2591
    iput-object v0, v3, Lajv;->d:Lajx;

    .line 82
    invoke-virtual {v3}, Lajv;->a()Lajq;

    move-result-object v0

    .line 106
    :goto_1
    iput-object v0, p0, Lain;->Z:Landroid/app/Dialog;

    goto :goto_0

    .line 84
    :cond_2
    const-string v2, "url"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 85
    invoke-static {v2}, Laji;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 86
    const-string v0, "FacebookDialogFragment"

    const-string v2, "Cannot start a fallback WebDialog with an empty/missing \'url\'"

    invoke-static {v0, v2}, Laji;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    invoke-virtual {v1}, Lm;->finish()V

    goto :goto_0

    .line 93
    :cond_3
    const-string v0, "fb%s://bridge/"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 94
    invoke-static {}, Lafv;->h()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 95
    new-instance v0, Laiu;

    invoke-direct {v0, v1, v2, v3}, Laiu;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    new-instance v1, Laip;

    invoke-direct {v1, p0}, Laip;-><init>(Lain;)V

    .line 3164
    iput-object v1, v0, Lajq;->b:Lajx;

    goto :goto_1
.end method

.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 114
    iget-object v0, p0, Lain;->Z:Landroid/app/Dialog;

    if-nez v0, :cond_0

    .line 115
    invoke-direct {p0, v1, v1}, Lain;->a(Landroid/os/Bundle;Lafq;)V

    .line 3254
    const/4 v0, 0x0

    iput-boolean v0, p0, Li;->c:Z

    .line 118
    :cond_0
    iget-object v0, p0, Lain;->Z:Landroid/app/Dialog;

    return-object v0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 132
    .line 4207
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    .line 132
    if-eqz v0, :cond_0

    .line 4808
    iget-boolean v0, p0, Lj;->G:Z

    .line 132
    if-eqz v0, :cond_0

    .line 5207
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    .line 133
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setDismissMessage(Landroid/os/Message;)V

    .line 135
    :cond_0
    invoke-super {p0}, Li;->d()V

    .line 136
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 123
    invoke-super {p0, p1}, Li;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 125
    iget-object v0, p0, Lain;->Z:Landroid/app/Dialog;

    instance-of v0, v0, Lajq;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lain;->Z:Landroid/app/Dialog;

    check-cast v0, Lajq;

    invoke-virtual {v0}, Lajq;->a()V

    .line 128
    :cond_0
    return-void
.end method
