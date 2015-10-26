.class final Laxr;
.super Lyz;
.source "PG"


# instance fields
.field final synthetic b:Laxq;


# direct methods
.method constructor <init>(Laxq;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Laxr;->b:Laxq;

    invoke-direct {p0}, Lyz;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    const v0, 0x7fffffff

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 80
    iget-object v1, p0, Laxr;->b:Laxq;

    .line 1039
    iget-object v1, v1, Laxq;->c:Ljava/util/List;

    .line 80
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Laxr;->b:Laxq;

    .line 2039
    iget v2, v2, Laxq;->g:I

    .line 80
    mul-int/2addr v1, v2

    iget-object v2, p0, Laxr;->b:Laxq;

    .line 3039
    iget v2, v2, Laxq;->f:I

    .line 80
    if-ge v1, v2, :cond_0

    .line 81
    new-array v0, v4, [Ljava/lang/Object;

    iget-object v1, p0, Laxr;->b:Laxq;

    .line 4039
    iget-object v1, v1, Laxq;->c:Ljava/util/List;

    .line 81
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    .line 82
    iget-object v0, p0, Laxr;->b:Laxq;

    .line 5039
    iget-object v0, v0, Laxq;->c:Ljava/util/List;

    .line 82
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 86
    :goto_0
    return v0

    .line 85
    :cond_0
    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    goto :goto_0
.end method

.method public final synthetic a(Landroid/view/ViewGroup;I)Lzr;
    .locals 6

    .prologue
    .line 77
    .line 10120
    iget-object v0, p0, Laxr;->b:Laxq;

    .line 11039
    iget-object v0, v0, Laxq;->b:Landroid/content/Context;

    .line 10120
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dT:I

    .line 10121
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 10122
    iget-object v1, p0, Laxr;->b:Laxq;

    .line 12039
    iget v1, v1, Laxq;->g:I

    .line 10122
    mul-int/lit8 v0, v0, 0x2

    sub-int v0, v1, v0

    .line 10123
    int-to-float v1, v0

    const v2, 0x3edb6db7

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 10124
    new-instance v2, Lbch;

    iget-object v3, p0, Laxr;->b:Laxq;

    .line 13039
    iget-object v3, v3, Laxq;->b:Landroid/content/Context;

    .line 10125
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    sget v4, La;->gp:I

    const/4 v5, 0x0

    invoke-virtual {v3, v4, p1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    invoke-direct {v2, v3, v0, v1}, Lbch;-><init>(Landroid/view/View;II)V

    .line 77
    return-object v2
.end method

.method public final synthetic a(Lzr;I)V
    .locals 8

    .prologue
    .line 77
    check-cast p1, Lbch;

    .line 5092
    iget-object v0, p0, Laxr;->b:Laxq;

    .line 6039
    iget-object v0, v0, Laxq;->c:Ljava/util/List;

    .line 5092
    iget-object v1, p0, Laxr;->b:Laxq;

    .line 7039
    iget-object v1, v1, Laxq;->c:Ljava/util/List;

    .line 5092
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    rem-int v1, p2, v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lbcd;

    .line 5093
    new-instance v7, Laxs;

    invoke-direct {v7, p0}, Laxs;-><init>(Laxr;)V

    .line 7066
    iget-object v0, p1, Lbch;->k:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v1

    .line 7197
    iget-object v1, v1, Latf;->m:Laer;

    .line 8096
    iget-object v2, v6, Lbcd;->a:Ldbk;

    iget-object v2, v2, Ldbk;->b:Ldbj;

    iget-object v2, v2, Ldbj;->a:Ljava/lang/String;

    .line 7066
    const/4 v3, 0x0

    iget v4, p1, Lbch;->l:I

    iget v5, p1, Lbch;->m:I

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 7068
    iget-object v0, p1, Lbch;->o:Landroid/widget/ImageView;

    .line 8104
    iget v1, v6, Lbcd;->c:I

    .line 7068
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 7069
    iget-object v0, p1, Lbch;->p:Landroid/widget/TextView;

    .line 9100
    iget-object v1, v6, Lbcd;->b:Ljava/lang/String;

    .line 7069
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7071
    iget-object v0, p1, Lbch;->q:Landroid/view/View;

    new-instance v1, Lbci;

    invoke-direct {v1, p1, v6, v7}, Lbci;-><init>(Lbch;Lbcd;Lbcm;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7082
    iget-object v0, p1, Lbch;->a:Landroid/view/View;

    new-instance v1, Lbcj;

    invoke-direct {v1, p1, v6, v7}, Lbcj;-><init>(Lbch;Lbcd;Lbcm;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7091
    iget-object v0, p1, Lbch;->a:Landroid/view/View;

    new-instance v1, Lbck;

    invoke-direct {v1, p1, v7}, Lbck;-><init>(Lbch;Lbcm;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 7098
    iget-object v0, p1, Lbch;->n:Lyt;

    new-instance v1, Lbcl;

    invoke-direct {v1, p1, v6, v7, p2}, Lbcl;-><init>(Lbch;Lbcd;Lbcm;I)V

    .line 9210
    iput-object v1, v0, Lyt;->d:Lwg;

    .line 77
    return-void
.end method
