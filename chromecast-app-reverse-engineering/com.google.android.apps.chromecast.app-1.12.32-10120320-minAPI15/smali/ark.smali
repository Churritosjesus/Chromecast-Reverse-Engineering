.class public final Lark;
.super Li;
.source "PG"


# instance fields
.field private final Z:Lblp;

.field private aa:I

.field private ab:I

.field private ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

.field private ad:Lari;

.field private ae:Ldcd;

.field private af:Ljava/lang/String;

.field private ag:Ljava/lang/String;

.field private ah:Ljava/lang/String;

.field private ai:Ldca;

.field private aj:I

.field private ak:Landroid/widget/TextView;

.field private al:Landroid/widget/TextView;

.field private am:Landroid/widget/ImageView;

.field private an:Landroid/widget/ViewFlipper;

.field private ao:Landroid/support/v7/widget/RecyclerView;

.field private ap:Lxq;

.field private aq:Landroid/app/Dialog;

.field private ar:Ljava/lang/Integer;

.field private as:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 37
    invoke-direct {p0}, Li;-><init>()V

    .line 49
    new-instance v0, Lblp;

    const-string v1, "BackdropPreviewFragment"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lark;->Z:Lblp;

    return-void
.end method

.method static synthetic a(Lark;)I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lark;->aa:I

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/String;I)Lark;
    .locals 5

    .prologue
    .line 88
    new-instance v2, Lark;

    invoke-direct {v2}, Lark;-><init>()V

    .line 90
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 91
    const-string v0, "displayId"

    invoke-virtual {v3, v0, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    const-string v0, "albumName"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "position"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 94
    const-string v4, "albumId"

    if-nez p3, :cond_0

    const-wide/16 v0, -0x1

    :goto_0
    invoke-virtual {v3, v4, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 95
    const-string v0, "photoContainerId"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string v0, "numPhotos"

    invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 97
    invoke-virtual {v2, v3}, Lark;->f(Landroid/os/Bundle;)V

    .line 99
    return-object v2

    .line 94
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0
.end method

.method static synthetic a(Lark;Ldcd;)Ldcd;
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lark;->ae:Ldcd;

    return-object p1
.end method

.method static synthetic b(Lark;)Lblp;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lark;->Z:Lblp;

    return-object v0
.end method

.method static synthetic c(Lark;)Ldcd;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lark;->ae:Ldcd;

    return-object v0
.end method

.method private p()I
    .locals 2

    .prologue
    .line 236
    iget-object v0, p0, Lark;->aq:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 237
    div-int/lit8 v0, v0, 0x3

    iget v1, p0, Lark;->aa:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    .line 238
    int-to-float v0, v0

    const/high16 v1, 0x3f100000    # 0.5625f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 110
    invoke-super {p0}, Li;->a()V

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 112
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 104
    invoke-super {p0, p1}, Li;->a(Landroid/app/Activity;)V

    .line 105
    check-cast p1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iput-object p1, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 106
    return-void
.end method

.method public final a(Ldcd;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 211
    invoke-virtual {p0}, Lark;->e()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    if-ne v1, v0, :cond_3

    .line 212
    iget-object v1, p0, Lark;->ar:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 12228
    iget v1, p0, Lark;->aj:I

    if-nez v1, :cond_2

    .line 12229
    :goto_0
    invoke-virtual {p0}, Lark;->e()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, La;->dX:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lark;->ab:I

    .line 12231
    const/4 v1, 0x3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 12232
    invoke-direct {p0}, Lark;->p()I

    move-result v1

    iget v2, p0, Lark;->ab:I

    iget v3, p0, Lark;->aa:I

    add-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    mul-int/2addr v0, v1

    .line 213
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lark;->ar:Ljava/lang/Integer;

    .line 215
    :cond_0
    iget-object v0, p0, Lark;->as:Ljava/lang/Integer;

    if-nez v0, :cond_1

    .line 216
    invoke-direct {p0}, Lark;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lark;->as:Ljava/lang/Integer;

    .line 218
    :cond_1
    iget-object v0, p0, Lark;->an:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lark;->ar:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 222
    :goto_1
    iget-object v1, p0, Lark;->ad:Lari;

    iget-object v0, p0, Lark;->as:Ljava/lang/Integer;

    if-nez v0, :cond_4

    .line 223
    invoke-direct {p0}, Lark;->p()I

    move-result v0

    .line 13046
    :goto_2
    iget-object v2, p1, Ldcd;->a:[Ldce;

    iput-object v2, v1, Lari;->b:[Ldce;

    .line 13047
    iput v0, v1, Lari;->c:I

    .line 13380
    iget-object v0, v1, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    .line 224
    iget-object v0, p0, Lark;->an:Landroid/widget/ViewFlipper;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 225
    return-void

    .line 12228
    :cond_2
    iget v0, p0, Lark;->aj:I

    add-int/lit8 v0, v0, -0x1

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 220
    :cond_3
    iget-object v0, p0, Lark;->an:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_1

    .line 223
    :cond_4
    iget-object v0, p0, Lark;->as:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2
.end method

.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 13

    .prologue
    const/4 v5, 0x0

    const/16 v2, 0x64

    const/4 v12, 0x1

    const/4 v7, 0x0

    .line 116
    iget-object v0, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-static {v0}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lark;->ag:Ljava/lang/String;

    .line 117
    new-instance v0, Lari;

    iget-object v1, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-direct {v0, v1}, Lari;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lark;->ad:Lari;

    .line 118
    iget-object v0, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 5625
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->f:Ljava/lang/String;

    .line 118
    iput-object v0, p0, Lark;->af:Ljava/lang/String;

    .line 6559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 119
    const-string v1, "displayId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lark;->ah:Ljava/lang/String;

    .line 121
    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 122
    iget-object v0, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->gw:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 124
    sget v0, Lf;->cW:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lark;->ak:Landroid/widget/TextView;

    .line 125
    sget v0, Lf;->da:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lark;->al:Landroid/widget/TextView;

    .line 126
    sget v0, Lf;->cX:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lark;->an:Landroid/widget/ViewFlipper;

    .line 127
    iget-object v0, p0, Lark;->an:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v12}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 129
    invoke-virtual {p0}, Lark;->e()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dW:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lark;->aa:I

    .line 131
    sget v0, Lf;->cY:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lark;->ao:Landroid/support/v7/widget/RecyclerView;

    .line 132
    new-instance v0, Lxq;

    iget-object v1, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6}, Lxq;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lark;->ap:Lxq;

    .line 133
    iget-object v0, p0, Lark;->ao:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lark;->ad:Lari;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lyz;)V

    .line 134
    iget-object v0, p0, Lark;->ao:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lark;->ap:Lxq;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 135
    iget-object v0, p0, Lark;->ao:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Larl;

    invoke-direct {v1, p0}, Larl;-><init>(Lark;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzf;)V

    .line 145
    iget-object v0, p0, Lark;->ao:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lxe;

    invoke-direct {v1}, Lxe;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzc;)V

    .line 147
    sget v0, Lf;->cV:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lark;->am:Landroid/widget/ImageView;

    .line 148
    iget-object v0, p0, Lark;->am:Landroid/widget/ImageView;

    new-instance v1, Larm;

    invoke-direct {v1, p0}, Larm;-><init>(Lark;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    iget-object v0, p0, Lark;->ak:Landroid/widget/TextView;

    .line 7559
    iget-object v1, p0, Lj;->m:Landroid/os/Bundle;

    .line 155
    const-string v6, "albumName"

    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 156
    const-string v1, "numPhotos"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 157
    if-gt v1, v2, :cond_3

    .line 158
    iget-object v0, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v6, La;->he:I

    new-array v8, v12, [Ljava/lang/Object;

    .line 159
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v7

    .line 158
    invoke-virtual {v0, v6, v1, v8}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 161
    :goto_0
    iget-object v6, p0, Lark;->al:Landroid/widget/TextView;

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lark;->aq:Landroid/app/Dialog;

    .line 164
    iget-object v0, p0, Lark;->aq:Landroid/app/Dialog;

    invoke-virtual {v0, v12}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 165
    iget-object v0, p0, Lark;->aq:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 167
    new-instance v0, Ldca;

    invoke-direct {v0}, Ldca;-><init>()V

    iput-object v0, p0, Lark;->ai:Ldca;

    .line 9559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 168
    const-string v3, "albumId"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 169
    iget-object v3, p0, Lark;->ai:Ldca;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-wide/16 v10, -0x1

    cmp-long v4, v8, v10

    if-nez v4, :cond_4

    move-object v0, v5

    :goto_1
    iput-object v0, v3, Ldca;->a:Ljava/lang/String;

    .line 170
    iget-object v0, p0, Lark;->ai:Ldca;

    .line 10559
    iget-object v3, p0, Lj;->m:Landroid/os/Bundle;

    .line 170
    const-string v4, "photoContainerId"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ldca;->b:Ljava/lang/String;

    .line 171
    if-ge v1, v2, :cond_5

    move v0, v1

    :goto_2
    iput v0, p0, Lark;->aj:I

    .line 172
    if-eqz p1, :cond_2

    .line 174
    :try_start_0
    const-string v0, "previewHeight"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    const-string v0, "previewHeight"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lark;->ar:Ljava/lang/Integer;

    .line 177
    :cond_0
    const-string v0, "previewResponse"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    const-string v0, "previewResponse"

    .line 179
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 178
    invoke-static {v0}, Ldcd;->a([B)Ldcd;

    move-result-object v0

    iput-object v0, p0, Lark;->ae:Ldcd;

    .line 181
    :cond_1
    const-string v0, "imageHeight"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 182
    const-string v0, "imageHeight"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lark;->as:Ljava/lang/Integer;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    :cond_2
    :goto_3
    iget-object v0, p0, Lark;->ar:Ljava/lang/Integer;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lark;->ae:Ldcd;

    if-eqz v0, :cond_6

    .line 190
    iget-object v0, p0, Lark;->ae:Ldcd;

    invoke-virtual {p0, v0}, Lark;->a(Ldcd;)V

    .line 194
    :goto_4
    iget-object v0, p0, Lark;->aq:Landroid/app/Dialog;

    return-object v0

    .line 160
    :cond_3
    iget-object v0, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    sget v6, Lb;->cP:I

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v12

    invoke-virtual {v0, v6, v8}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 169
    :cond_4
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    move v0, v2

    .line 171
    goto :goto_2

    .line 184
    :catch_0
    move-exception v0

    .line 185
    iget-object v1, p0, Lark;->Z:Lblp;

    const-string v2, "Error parsing preview bundle: %s"

    new-array v3, v12, [Ljava/lang/Object;

    aput-object v0, v3, v7

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 11242
    :cond_6
    new-instance v0, Laul;

    iget-object v1, p0, Lark;->ag:Ljava/lang/String;

    iget-object v2, p0, Lark;->af:Ljava/lang/String;

    iget-object v3, p0, Lark;->ah:Ljava/lang/String;

    iget-object v4, p0, Lark;->ai:Ldca;

    iget v6, p0, Lark;->aj:I

    new-instance v9, Larn;

    invoke-direct {v9, p0}, Larn;-><init>(Lark;)V

    new-instance v10, Laro;

    invoke-direct {v10, p0}, Laro;-><init>(Lark;)V

    move v8, v7

    invoke-direct/range {v0 .. v10}, Laul;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldca;Ljava/lang/String;IIILaea;Ladz;)V

    .line 11267
    iget-object v1, p0, Lark;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-static {v1}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v1

    invoke-virtual {v1, v0}, Latf;->a(Lads;)V

    goto :goto_4
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 199
    iget-object v0, p0, Lark;->ae:Ldcd;

    if-eqz v0, :cond_0

    .line 200
    const-string v0, "previewResponse"

    iget-object v1, p0, Lark;->ae:Ldcd;

    invoke-static {v1}, Ldcd;->a(Ldew;)[B

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 202
    :cond_0
    iget-object v0, p0, Lark;->ar:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 203
    const-string v0, "previewHeight"

    iget-object v1, p0, Lark;->ar:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 205
    :cond_1
    iget-object v0, p0, Lark;->as:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 206
    const-string v0, "imageHeight"

    iget-object v1, p0, Lark;->as:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 208
    :cond_2
    return-void
.end method
