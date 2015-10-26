.class public final Lbmn;
.super Li;
.source "PG"

# interfaces
.implements Lals;
.implements Lalu;


# instance fields
.field private Z:Laow;

.field private aa:Landroid/widget/SeekBar;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/widget/TextView;

.field private ad:Landroid/widget/ImageButton;

.field private ae:Lblp;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 50
    invoke-direct {p0}, Li;-><init>()V

    .line 51
    new-instance v0, Lblp;

    const-string v1, "RemoteControlDialogFragment"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbmn;->ae:Lblp;

    .line 52
    return-void
.end method

.method static synthetic a(Lbmn;I)D
    .locals 4

    .prologue
    .line 28
    .line 7160
    int-to-double v0, p1

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    .line 28
    return-wide v0
.end method

.method static synthetic a(Lbmn;)Laow;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lbmn;->Z:Laow;

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lbmn;
    .locals 3

    .prologue
    .line 43
    new-instance v0, Lbmn;

    invoke-direct {v0}, Lbmn;-><init>()V

    .line 44
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 45
    const-string v2, "deviceKey"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    invoke-virtual {v0, v1}, Lbmn;->f(Landroid/os/Bundle;)V

    .line 47
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 72
    iget-object v0, p0, Lbmn;->Z:Laow;

    if-nez v0, :cond_0

    .line 74
    const/4 v0, 0x0

    .line 125
    :goto_0
    return-object v0

    .line 76
    :cond_0
    sget v0, La;->fS:I

    invoke-virtual {p1, v0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 78
    sget v0, Lf;->aF:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 79
    iget-object v2, p0, Lbmn;->Z:Laow;

    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    sget v0, Lf;->em:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbmn;->ab:Landroid/widget/TextView;

    .line 81
    sget v0, Lf;->t:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbmn;->ac:Landroid/widget/TextView;

    .line 83
    sget v0, Lf;->Z:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lbmo;

    invoke-direct {v2, p0}, Lbmo;-><init>(Lbmn;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    sget v0, Lf;->eb:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lbmp;

    invoke-direct {v2, p0}, Lbmp;-><init>(Lbmn;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    sget v0, Lf;->cQ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lbmn;->ad:Landroid/widget/ImageButton;

    .line 99
    iget-object v0, p0, Lbmn;->ad:Landroid/widget/ImageButton;

    new-instance v2, Lbmq;

    invoke-direct {v2, p0}, Lbmq;-><init>(Lbmn;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    sget v0, Lf;->W:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lbmn;->aa:Landroid/widget/SeekBar;

    .line 107
    iget-object v0, p0, Lbmn;->aa:Landroid/widget/SeekBar;

    const/16 v2, 0x64

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setMax(I)V

    .line 108
    iget-object v0, p0, Lbmn;->aa:Landroid/widget/SeekBar;

    new-instance v2, Lbmr;

    invoke-direct {v2, p0}, Lbmr;-><init>(Lbmn;)V

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    move-object v0, v1

    .line 125
    goto :goto_0
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 59
    invoke-super {p0, p1}, Li;->a(Landroid/os/Bundle;)V

    .line 60
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v0

    .line 1559
    iget-object v1, p0, Lj;->m:Landroid/os/Bundle;

    .line 61
    const-string v2, "deviceKey"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lalm;->c(Ljava/lang/String;)Laow;

    move-result-object v0

    iput-object v0, p0, Lbmn;->Z:Laow;

    .line 62
    iget-object v0, p0, Lbmn;->Z:Laow;

    if-nez v0, :cond_0

    .line 2167
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Li;->a(Z)V

    .line 3114
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Li;->a:I

    .line 3115
    iget v0, p0, Li;->a:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget v0, p0, Li;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 3116
    :cond_1
    const v0, 0x1030059

    iput v0, p0, Li;->b:I

    .line 67
    :cond_2
    return-void
.end method

.method public final a(Laow;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 166
    .line 4398
    iget-object v0, p1, Laow;->o:Ljava/lang/String;

    .line 166
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 167
    invoke-virtual {p1}, Laow;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 168
    invoke-virtual {p1}, Laow;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5167
    :cond_0
    invoke-virtual {p0, v3}, Li;->a(Z)V

    .line 195
    :cond_1
    :goto_0
    return-void

    .line 172
    :cond_2
    invoke-virtual {p1}, Laow;->o()Latu;

    move-result-object v0

    .line 5245
    iget-object v1, v0, Latu;->f:Ljava/lang/String;

    .line 174
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 175
    iget-object v1, p0, Lbmn;->ab:Landroid/widget/TextView;

    sget v2, Lb;->bX:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 179
    :goto_1
    iget-object v1, p0, Lbmn;->ac:Landroid/widget/TextView;

    .line 5250
    iget-object v2, v0, Latu;->g:Ljava/lang/String;

    .line 179
    invoke-static {v1, v2}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 5288
    iget-object v1, v0, Latu;->d:Latv;

    .line 182
    if-eqz v1, :cond_1

    .line 183
    invoke-virtual {v1}, Latv;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 184
    iget-object v0, p0, Lbmn;->ad:Landroid/widget/ImageButton;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 5325
    :goto_2
    iget-wide v0, v1, Latv;->b:D

    .line 6152
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 191
    iget-object v1, p0, Lbmn;->aa:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 192
    iget-object v1, p0, Lbmn;->aa:Landroid/widget/SeekBar;

    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_0

    .line 177
    :cond_3
    iget-object v2, p0, Lbmn;->ab:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 186
    :cond_4
    iget-object v0, p0, Lbmn;->ad:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 187
    iget-object v2, p0, Lbmn;->ad:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Latv;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 188
    sget v0, La;->eK:I

    .line 187
    :goto_3
    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_2

    .line 188
    :cond_5
    sget v0, La;->eI:I

    goto :goto_3
.end method

.method public final b(Laow;)V
    .locals 4

    .prologue
    .line 199
    invoke-virtual {p1}, Laow;->o()Latu;

    move-result-object v0

    .line 6288
    iget-object v0, v0, Latu;->d:Latv;

    .line 200
    if-eqz v0, :cond_0

    .line 6325
    iget-wide v0, v0, Latv;->b:D

    .line 7152
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 202
    iget-object v1, p0, Lbmn;->aa:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 203
    iget-object v1, p0, Lbmn;->aa:Landroid/widget/SeekBar;

    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 206
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 130
    invoke-super {p0}, Li;->j()V

    .line 131
    iget-object v0, p0, Lbmn;->Z:Laow;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lbmn;->Z:Laow;

    invoke-virtual {p0, v0}, Lbmn;->a(Laow;)V

    .line 133
    iget-object v0, p0, Lbmn;->Z:Laow;

    invoke-virtual {v0, p0}, Laow;->a(Lals;)V

    .line 134
    iget-object v0, p0, Lbmn;->Z:Laow;

    .line 3298
    iget-object v0, v0, Laow;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    :cond_0
    return-void
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 140
    invoke-super {p0}, Li;->k()V

    .line 141
    iget-object v0, p0, Lbmn;->Z:Laow;

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lbmn;->Z:Laow;

    .line 4290
    iget-object v0, v0, Laow;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 143
    iget-object v0, p0, Lbmn;->Z:Laow;

    .line 4306
    iget-object v0, v0, Laow;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 145
    :cond_0
    return-void
.end method
