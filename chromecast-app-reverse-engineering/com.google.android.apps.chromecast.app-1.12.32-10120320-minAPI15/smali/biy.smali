.class public final Lbiy;
.super Lbjq;
.source "PG"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field private Z:Landroid/widget/TextView;

.field public a:Landroid/media/MediaPlayer;

.field private aa:Landroid/view/SurfaceHolder;

.field private ab:Lbjd;

.field private ac:Z

.field public b:Z

.field private final d:Lblp;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 69
    invoke-direct {p0}, Lbjq;-><init>()V

    .line 70
    new-instance v0, Lblp;

    const-string v1, "OtaWaitVideoFragment"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbiy;->d:Lblp;

    .line 71
    return-void
.end method

.method public static a(Ljava/lang/String;)Lbiy;
    .locals 3

    .prologue
    .line 62
    new-instance v0, Lbiy;

    invoke-direct {v0}, Lbiy;-><init>()V

    .line 63
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 64
    const-string v2, "videoUrl"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    invoke-virtual {v0, v1}, Lbiy;->f(Landroid/os/Bundle;)V

    .line 66
    return-object v0
.end method

.method static synthetic a(Lbiy;)Lbjd;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lbiy;->ab:Lbjd;

    return-object v0
.end method

.method static synthetic a(Lbiy;Z)Z
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbiy;->b:Z

    return v0
.end method

.method static synthetic b(Lbiy;)Landroid/media/MediaPlayer;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method static synthetic c(Lbiy;)Lblp;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lbiy;->d:Lblp;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 145
    sget v0, La;->gr:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 146
    sget v0, Lf;->es:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    .line 147
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iput-object v0, p0, Lbiy;->aa:Landroid/view/SurfaceHolder;

    .line 148
    iget-object v0, p0, Lbiy;->aa:Landroid/view/SurfaceHolder;

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 150
    sget v0, Lf;->dR:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lbjc;

    invoke-direct {v2, p0}, Lbjc;-><init>(Lbiy;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    sget v0, Lf;->cE:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbiy;->Z:Landroid/widget/TextView;

    .line 158
    return-object v1
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 81
    invoke-super {p0}, Lbjq;->a()V

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lbiy;->ab:Lbjd;

    .line 83
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 75
    invoke-super {p0, p1}, Lbjq;->a(Landroid/app/Activity;)V

    .line 76
    check-cast p1, Lbjd;

    iput-object p1, p0, Lbiy;->ab:Lbjd;

    .line 77
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v0, 0x0

    .line 87
    invoke-super {p0, p1}, Lbjq;->a(Landroid/os/Bundle;)V

    .line 89
    invoke-virtual {p0, v4}, Lbiy;->c(Z)V

    .line 90
    new-instance v1, Landroid/media/MediaPlayer;

    invoke-direct {v1}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v1, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    .line 91
    iget-object v1, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 94
    :try_start_0
    iget-object v1, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    .line 1559
    iget-object v2, p0, Lj;->m:Landroid/os/Bundle;

    .line 94
    const-string v3, "videoUrl"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    if-eqz p1, :cond_0

    .line 103
    const-string v0, "playbackPosition"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 108
    :cond_0
    iget-object v1, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    new-instance v2, Lbiz;

    invoke-direct {v2, p0, v0}, Lbiz;-><init>(Lbiy;I)V

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 119
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    new-instance v1, Lbja;

    invoke-direct {v1, p0}, Lbja;-><init>(Lbiy;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 128
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    new-instance v1, Lbjb;

    invoke-direct {v1, p0}, Lbjb;-><init>(Lbiy;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 138
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 139
    :goto_0
    return-void

    .line 95
    :catch_0
    move-exception v1

    .line 96
    iget-object v2, p0, Lbiy;->d:Lblp;

    const-string v3, "Issue playing video: %s"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v0

    invoke-virtual {v2, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v1, p0, Lbiy;->ab:Lbjd;

    invoke-interface {v1, v0, v0}, Lbjd;->a(II)V

    goto :goto_0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 201
    const/4 v0, 0x0

    iput-object v0, p0, Lbiy;->Z:Landroid/widget/TextView;

    .line 202
    invoke-super {p0}, Lbjq;->d()V

    .line 203
    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 163
    invoke-super {p0, p1}, Lbjq;->d(Landroid/os/Bundle;)V

    .line 164
    if-eqz p1, :cond_0

    .line 165
    const-string v0, "shouldPlay"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lbiy;->ac:Z

    .line 167
    :cond_0
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 193
    invoke-super {p0, p1}, Lbjq;->e(Landroid/os/Bundle;)V

    .line 194
    const-string v0, "playbackPosition"

    iget-object v1, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 195
    const-string v0, "shouldPlay"

    iget-boolean v1, p0, Lbiy;->ac:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 196
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 171
    invoke-super {p0}, Lbjq;->j()V

    .line 172
    iget-boolean v0, p0, Lbiy;->ac:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_0

    .line 173
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lbiy;->ac:Z

    .line 176
    :cond_0
    return-void
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 180
    invoke-super {p0}, Lbjq;->k()V

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 181
    invoke-virtual {v0}, Lm;->isChangingConfigurations()Z

    move-result v0

    if-nez v0, :cond_0

    .line 182
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbiy;->ac:Z

    .line 184
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 189
    :cond_0
    return-void
.end method

.method public final l()V
    .locals 1

    .prologue
    .line 207
    invoke-super {p0}, Lbjq;->l()V

    .line 209
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 212
    :cond_0
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 213
    const/4 v0, 0x0

    iput-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    .line 214
    return-void
.end method

.method protected final p()Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lbiy;->Z:Landroid/widget/TextView;

    return-object v0
.end method

.method public q()V
    .locals 3

    .prologue
    .line 255
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v0

    .line 256
    if-lez v0, :cond_0

    .line 257
    iget-object v1, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v1

    .line 2612
    iget-object v2, p0, Lj;->y:Lm;

    .line 259
    invoke-static {v2}, Lblx;->a(Landroid/app/Activity;)I

    move-result v2

    .line 260
    mul-int/2addr v1, v2

    div-int v0, v1, v0

    .line 261
    iget-object v1, p0, Lbiy;->aa:Landroid/view/SurfaceHolder;

    invoke-interface {v1, v2, v0}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 263
    :cond_0
    return-void
.end method

.method public final surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .prologue
    .line 237
    return-void
.end method

.method public final surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 242
    iget-boolean v0, p0, Lbiy;->b:Z

    if-eqz v0, :cond_0

    .line 243
    invoke-virtual {p0}, Lbiy;->q()V

    .line 245
    :cond_0
    return-void
.end method

.method public final surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    .prologue
    .line 249
    iget-object v0, p0, Lbiy;->a:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 250
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 251
    return-void
.end method
