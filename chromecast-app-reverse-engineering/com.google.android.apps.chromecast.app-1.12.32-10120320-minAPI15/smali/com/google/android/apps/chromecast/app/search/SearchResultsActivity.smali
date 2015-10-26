.class public Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;
.super Lmm;
.source "PG"

# interfaces
.implements Laov;
.implements Laxb;
.implements Lbgk;


# instance fields
.field private final e:Lblp;

.field private f:Landroid/support/v7/widget/SearchView;

.field private g:Landroid/widget/ViewFlipper;

.field private h:I

.field private i:I

.field private j:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0}, Lmm;-><init>()V

    .line 53
    new-instance v0, Lblp;

    const-string v1, "SearchResultsActivity"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->e:Lblp;

    return-void
.end method

.method private a(I)V
    .locals 1

    .prologue
    .line 235
    iput p1, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->h:I

    .line 236
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->g:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, p1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 237
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;I)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->a(I)V

    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;Ldbp;)V
    .locals 4

    .prologue
    .line 43
    .line 4174
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->j:Z

    if-nez v0, :cond_0

    .line 4808
    iget-object v1, p0, Lm;->b:Lt;

    .line 4178
    const-string v0, "searchResultsFragment"

    .line 4179
    invoke-virtual {v1, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lbgb;

    .line 4180
    if-nez v0, :cond_1

    .line 4181
    invoke-static {p1}, Lbgb;->a(Ldbp;)Lbgb;

    move-result-object v0

    .line 4182
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v1

    sget v2, Lf;->bk:I

    const-string v3, "searchResultsFragment"

    .line 4183
    invoke-virtual {v1, v2, v0, v3}, Laf;->b(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    .line 4184
    invoke-virtual {v0}, Laf;->a()Laf;

    move-result-object v0

    .line 4185
    invoke-virtual {v0}, Laf;->c()I

    :cond_0
    :goto_0
    return-void

    .line 4187
    :cond_1
    const-string v2, "searchResultsFragment"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lr;->a(Ljava/lang/String;I)V

    .line 5559
    iget-object v1, v0, Lj;->m:Landroid/os/Bundle;

    .line 5074
    const-string v2, "searchResponse"

    invoke-static {p1}, Ldbp;->a(Ldew;)[B

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 5075
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lbgd;

    invoke-direct {v2, v0, p1}, Lbgd;-><init>(Lbgb;Ldbp;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;I)I
    .locals 0

    .prologue
    .line 43
    iput p1, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->i:I

    return p1
.end method

.method private e()V
    .locals 5

    .prologue
    .line 119
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->a(I)V

    .line 120
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "query"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 121
    invoke-static {p0}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v1

    .line 123
    new-instance v2, Lbfy;

    invoke-direct {v2, p0}, Lbfy;-><init>(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;)V

    .line 130
    new-instance v3, Lbfz;

    invoke-direct {v3, p0, v0}, Lbfz;-><init>(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;Ljava/lang/String;)V

    .line 144
    new-instance v4, Lbga;

    invoke-direct {v4, p0, v0, v3, v2}, Lbga;-><init>(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;Ljava/lang/String;Laea;Ladz;)V

    invoke-virtual {v1, v4, v2}, Latf;->a(Latr;Ladz;)V

    .line 156
    return-void
.end method


# virtual methods
.method public final a(Ldbf;)V
    .locals 3

    .prologue
    .line 212
    const/16 v0, 0x87

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->i:I

    .line 213
    invoke-virtual {v0, v1}, Lapg;->c(I)Lapg;

    move-result-object v0

    iget-object v1, p1, Ldbf;->b:Ljava/lang/String;

    .line 3074
    iput-object v1, v0, Lapg;->f:Ljava/lang/String;

    .line 215
    invoke-virtual {v0}, Lapg;->b()V

    .line 3808
    iget-object v0, p0, Lm;->b:Lt;

    .line 217
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    sget v1, Lf;->bk:I

    .line 218
    invoke-static {p1}, Lbge;->a(Ldbf;)Lbge;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Laf;->a(ILj;)Laf;

    move-result-object v0

    const/16 v1, 0x1001

    .line 219
    invoke-virtual {v0, v1}, Laf;->a(I)Laf;

    move-result-object v0

    const-string v1, "searchResultsFragment"

    .line 220
    invoke-virtual {v0, v1}, Laf;->a(Ljava/lang/String;)Laf;

    move-result-object v0

    .line 221
    invoke-virtual {v0}, Laf;->b()I

    .line 222
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ldbb;)V
    .locals 4

    .prologue
    .line 195
    const/16 v0, 0x85

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    .line 2079
    iput-object p1, v0, Lapg;->c:Ljava/lang/String;

    .line 2084
    iput-object p2, v0, Lapg;->b:Ljava/lang/String;

    .line 197
    iget v1, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->i:I

    .line 198
    invoke-virtual {v0, v1}, Lapg;->c(I)Lapg;

    move-result-object v0

    .line 199
    invoke-virtual {v0}, Lapg;->b()V

    .line 201
    const/4 v0, 0x1

    invoke-static {p1, p3, v0}, Lawr;->a(Ljava/lang/String;Ldbb;Z)Lawr;

    move-result-object v0

    .line 2808
    iget-object v1, p0, Lm;->b:Lt;

    .line 202
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v1

    sget v2, Lf;->bk:I

    const-string v3, "detailsFragment"

    .line 203
    invoke-virtual {v1, v2, v0, v3}, Laf;->a(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    const/16 v1, 0x1001

    .line 204
    invoke-virtual {v0, v1}, Laf;->a(I)Laf;

    move-result-object v0

    const-string v1, "searchResultsFragment"

    .line 205
    invoke-virtual {v0, v1}, Laf;->a(Ljava/lang/String;)Laf;

    move-result-object v0

    .line 206
    invoke-virtual {v0}, Laf;->b()I

    .line 208
    return-void
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 226
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 227
    return-void
.end method

.method public final j()V
    .locals 2

    .prologue
    .line 231
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 232
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 63
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->j:Z

    .line 66
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 1462
    iget-boolean v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->b:Z

    .line 66
    if-nez v0, :cond_1

    .line 69
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 70
    const v1, 0x8000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 71
    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->startActivity(Landroid/content/Intent;)V

    .line 97
    :cond_0
    :goto_0
    return-void

    .line 74
    :cond_1
    sget v0, La;->gE:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->setContentView(I)V

    .line 75
    sget v0, Lf;->dt:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->g:Landroid/widget/ViewFlipper;

    .line 77
    invoke-static {p0}, Lblx;->g(Landroid/app/Activity;)V

    .line 79
    sget v0, Lf;->aX:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 80
    sget v1, La;->eC:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 81
    new-instance v1, Lbfx;

    invoke-direct {v1, p0}, Lbfx;-><init>(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    sget v0, Lf;->f:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/SearchView;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->f:Landroid/support/v7/widget/SearchView;

    .line 88
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->f:Landroid/support/v7/widget/SearchView;

    sget v1, Lf;->du:I

    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lblx;->a(Landroid/app/Activity;Landroid/support/v7/widget/SearchView;Landroid/view/View;Landroid/view/View$OnFocusChangeListener;)V

    .line 89
    if-nez p1, :cond_2

    .line 90
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->e()V

    goto :goto_0

    .line 92
    :cond_2
    const-string v0, "viewFlipperIndex"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->a(I)V

    .line 93
    const-string v0, "viewFlipperIndex"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 94
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->e()V

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 101
    invoke-super {p0}, Lmm;->onDestroy()V

    .line 102
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->j:Z

    .line 103
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 107
    invoke-super {p0, p1}, Lmm;->onNewIntent(Landroid/content/Intent;)V

    .line 108
    invoke-virtual {p0, p1}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->setIntent(Landroid/content/Intent;)V

    .line 109
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->e()V

    .line 110
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 160
    invoke-super {p0}, Lmm;->onResume()V

    .line 161
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 171
    :cond_0
    :goto_0
    return-void

    .line 164
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "query"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 165
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->f:Landroid/support/v7/widget/SearchView;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/CharSequence;Z)V

    .line 167
    sget v0, La;->br:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 168
    if-eqz v0, :cond_0

    .line 169
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 114
    invoke-super {p0, p1}, Lmm;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 115
    const-string v0, "viewFlipperIndex"

    iget v1, p0, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->h:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 116
    return-void
.end method
