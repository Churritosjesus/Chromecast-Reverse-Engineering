.class public final Lboc;
.super Lzr;
.source "PG"


# instance fields
.field A:Landroid/view/View;

.field B:Landroid/view/View;

.field C:Landroid/view/View;

.field D:Landroid/view/View;

.field k:Landroid/widget/TextView;

.field l:Landroid/widget/TextView;

.field m:Landroid/view/View;

.field n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

.field o:Landroid/view/View;

.field p:Landroid/view/View;

.field q:Landroid/widget/TextView;

.field r:Landroid/widget/TextView;

.field s:Landroid/widget/ImageView;

.field t:Landroid/widget/ImageView;

.field u:Landroid/widget/ImageView;

.field v:Landroid/widget/TextView;

.field w:Landroid/widget/ImageView;

.field x:Landroid/widget/TextView;

.field y:Landroid/widget/ImageView;

.field z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 268
    invoke-direct {p0, p1}, Lzr;-><init>(Landroid/view/View;)V

    .line 269
    iput-object p1, p0, Lboc;->m:Landroid/view/View;

    .line 270
    sget v0, Lf;->bA:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lboc;->k:Landroid/widget/TextView;

    .line 271
    sget v0, Lf;->cP:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lboc;->l:Landroid/widget/TextView;

    .line 272
    sget v0, Lf;->T:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lboc;->q:Landroid/widget/TextView;

    .line 273
    sget v0, Lf;->P:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lboc;->r:Landroid/widget/TextView;

    .line 274
    sget v0, Lf;->Q:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    iput-object v0, p0, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 275
    sget v0, Lf;->by:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lboc;->o:Landroid/view/View;

    .line 276
    sget v0, Lf;->R:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lboc;->p:Landroid/view/View;

    .line 277
    sget v0, Lf;->ax:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lboc;->s:Landroid/widget/ImageView;

    .line 278
    sget v0, Lf;->dC:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lboc;->t:Landroid/widget/ImageView;

    .line 279
    sget v0, Lf;->e:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lboc;->u:Landroid/widget/ImageView;

    .line 280
    sget v0, Lf;->x:I

    .line 281
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lboc;->v:Landroid/widget/TextView;

    .line 282
    sget v0, Lf;->bu:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lboc;->w:Landroid/widget/ImageView;

    .line 283
    sget v0, Lf;->db:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lboc;->y:Landroid/widget/ImageView;

    .line 284
    sget v0, Lf;->ck:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lboc;->z:Landroid/widget/ImageView;

    .line 285
    sget v0, Lf;->w:I

    .line 286
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lboc;->x:Landroid/widget/TextView;

    .line 287
    sget v0, Lf;->bg:I

    .line 288
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lboc;->D:Landroid/view/View;

    .line 289
    sget v0, Lf;->dA:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lboc;->A:Landroid/view/View;

    .line 290
    sget v0, Lf;->dW:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lboc;->B:Landroid/view/View;

    .line 291
    sget v0, Lf;->dn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lboc;->C:Landroid/view/View;

    .line 292
    return-void
.end method
