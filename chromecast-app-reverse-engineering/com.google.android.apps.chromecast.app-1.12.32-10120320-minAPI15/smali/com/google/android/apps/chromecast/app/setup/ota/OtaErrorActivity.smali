.class public Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;
.super Lm;
.source "PG"

# interfaces
.implements Lbjt;
.implements Lbjv;


# instance fields
.field private e:Lblp;

.field private f:Z

.field private g:Laph;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 44
    invoke-direct {p0}, Lm;-><init>()V

    .line 45
    new-instance v0, Lblp;

    const-string v1, "OtaErrorActivity"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->e:Lblp;

    .line 46
    return-void
.end method

.method public static a(Landroid/content/Context;ZLaph;)Landroid/content/Intent;
    .locals 2

    .prologue
    .line 38
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 39
    const-string v1, "supportsDisplay"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 40
    const-string v1, "deviceSetupSession"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 41
    return-object v0
.end method

.method private b(I)V
    .locals 3

    .prologue
    .line 140
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x99

    invoke-direct {v1, v2}, Lapd;-><init>(I)V

    .line 142
    invoke-virtual {v1, p1}, Lapd;->a(I)Lapd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->g:Laph;

    .line 4115
    iput-object v2, v1, Lapd;->h:Laph;

    .line 140
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 144
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 71
    .line 73
    sget v2, Lf;->L:I

    if-ne p1, v2, :cond_1

    .line 74
    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->f:Z

    if-eqz v1, :cond_0

    .line 75
    sget v2, Lb;->cz:I

    .line 76
    sget v1, Lb;->cy:I

    .line 77
    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->b(I)V

    .line 116
    :goto_0
    invoke-static {v2, v1, v0}, Lbjs;->a(IIZ)Lbjs;

    move-result-object v0

    .line 3808
    iget-object v1, p0, Lm;->b:Lt;

    .line 117
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v1

    sget v2, Lf;->ai:I

    .line 118
    invoke-virtual {v1, v2, v0}, Laf;->a(ILj;)Laf;

    move-result-object v0

    const/4 v1, 0x0

    .line 119
    invoke-virtual {v0, v1}, Laf;->a(Ljava/lang/String;)Laf;

    move-result-object v0

    .line 120
    invoke-virtual {v0}, Laf;->b()I

    .line 121
    :goto_1
    return-void

    .line 79
    :cond_0
    sget v2, Lb;->co:I

    .line 80
    sget v1, Lb;->cn:I

    .line 81
    const/4 v3, 0x2

    invoke-direct {p0, v3}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->b(I)V

    goto :goto_0

    .line 83
    :cond_1
    sget v2, Lf;->M:I

    if-ne p1, v2, :cond_3

    .line 84
    iget-boolean v2, p0, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->f:Z

    if-eqz v2, :cond_2

    .line 85
    sget v3, Lb;->cv:I

    .line 86
    sget v2, Lb;->cu:I

    .line 87
    invoke-direct {p0, v1}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->b(I)V

    move v1, v2

    move v2, v3

    goto :goto_0

    .line 89
    :cond_2
    sget v2, Lb;->cq:I

    .line 90
    sget v0, Lb;->cp:I

    .line 91
    const/4 v3, 0x3

    invoke-direct {p0, v3}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->b(I)V

    move v4, v1

    move v1, v0

    move v0, v4

    .line 92
    goto :goto_0

    .line 94
    :cond_3
    sget v1, Lf;->N:I

    if-ne p1, v1, :cond_5

    .line 95
    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->f:Z

    if-eqz v1, :cond_4

    .line 98
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->m()V

    goto :goto_1

    .line 101
    :cond_4
    sget v2, Lb;->cx:I

    .line 102
    sget v1, Lb;->cw:I

    .line 103
    const/4 v3, 0x4

    invoke-direct {p0, v3}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->b(I)V

    goto :goto_0

    .line 105
    :cond_5
    sget v0, Lf;->O:I

    if-ne p1, v0, :cond_6

    .line 106
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->b(I)V

    .line 107
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->m()V

    goto :goto_1

    .line 111
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->m()V

    goto :goto_1
.end method

.method public final l()V
    .locals 1

    .prologue
    .line 125
    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->b(I)V

    .line 126
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->finish()V

    .line 127
    return-void
.end method

.method public final m()V
    .locals 1

    .prologue
    .line 131
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->b(I)V

    .line 132
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->f:Z

    if-eqz v0, :cond_0

    .line 133
    invoke-static {p0}, Lblf;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 132
    :goto_0
    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->startActivity(Landroid/content/Intent;)V

    .line 136
    return-void

    .line 134
    :cond_0
    invoke-static {p0}, Lblf;->q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 50
    invoke-super {p0, p1}, Lm;->onCreate(Landroid/os/Bundle;)V

    .line 51
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "deviceSetupSession"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Laph;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->g:Laph;

    .line 53
    invoke-static {p0}, Lblx;->g(Landroid/app/Activity;)V

    .line 54
    sget v0, La;->gs:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->setContentView(I)V

    .line 56
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "supportsDisplay"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->f:Z

    .line 1808
    iget-object v0, p0, Lm;->b:Lt;

    .line 58
    sget v1, Lf;->ai:I

    invoke-virtual {v0, v1}, Lr;->a(I)Lj;

    move-result-object v0

    .line 59
    if-nez v0, :cond_0

    .line 60
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->f:Z

    invoke-static {v0}, Lbju;->a(Z)Lbju;

    move-result-object v0

    .line 2808
    iget-object v1, p0, Lm;->b:Lt;

    .line 61
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v1

    sget v2, Lf;->ai:I

    .line 62
    invoke-virtual {v1, v2, v0}, Laf;->a(ILj;)Laf;

    move-result-object v0

    .line 63
    invoke-virtual {v0}, Laf;->b()I

    .line 65
    :cond_0
    return-void
.end method
