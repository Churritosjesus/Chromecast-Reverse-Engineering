.class public final Laxx;
.super Lyz;
.source "PG"


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:[Ldbg;

.field private final d:Ljava/lang/String;

.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldbf;II)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Lyz;-><init>()V

    .line 25
    iput-object p1, p0, Laxx;->b:Landroid/content/Context;

    .line 26
    iget-object v0, p2, Ldbf;->g:[Ldbg;

    iput-object v0, p0, Laxx;->c:[Ldbg;

    .line 27
    iget-object v0, p2, Ldbf;->e:Ljava/lang/String;

    iput-object v0, p0, Laxx;->d:Ljava/lang/String;

    .line 28
    iput p3, p0, Laxx;->e:I

    .line 29
    iput p4, p0, Laxx;->f:I

    .line 30
    iget v0, p2, Ldbf;->f:I

    iput v0, p0, Laxx;->g:I

    .line 31
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Laxx;->c:[Ldbg;

    array-length v0, v0

    return v0
.end method

.method public final synthetic a(Landroid/view/ViewGroup;I)Lzr;
    .locals 5

    .prologue
    .line 14
    .line 2045
    iget v0, p0, Laxx;->g:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 2046
    sget v0, La;->ge:I

    .line 2047
    :goto_0
    new-instance v1, Laxo;

    iget-object v2, p0, Laxx;->b:Landroid/content/Context;

    iget-object v3, p0, Laxx;->b:Landroid/content/Context;

    .line 2048
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v0, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iget v3, p0, Laxx;->e:I

    iget v4, p0, Laxx;->f:I

    invoke-direct {v1, v2, v0, v3, v4}, Laxo;-><init>(Landroid/content/Context;Landroid/view/View;II)V

    .line 14
    return-object v1

    .line 2046
    :cond_0
    sget v0, La;->fQ:I

    goto :goto_0
.end method

.method public final synthetic a(Lzr;I)V
    .locals 10

    .prologue
    const/4 v9, 0x2

    const/4 v8, 0x0

    const/4 v3, 0x1

    .line 14
    check-cast p1, Laxo;

    .line 1040
    iget-object v0, p0, Laxx;->c:[Ldbg;

    aget-object v6, v0, p2

    iget-object v7, p0, Laxx;->d:Ljava/lang/String;

    .line 1059
    if-eqz v6, :cond_0

    iget-object v0, v6, Ldbg;->a:Ldbj;

    if-eqz v0, :cond_0

    iget-object v0, v6, Ldbg;->a:Ldbj;

    iget-object v0, v0, Ldbj;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1061
    :cond_0
    iget-object v0, p1, Laxo;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1062
    :goto_0
    return-void

    .line 1064
    :cond_1
    iget-object v0, p1, Laxo;->a:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1066
    iget-object v0, p1, Laxo;->m:Landroid/widget/TextView;

    iget-object v1, v6, Ldbg;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 1067
    iget-object v0, p1, Laxo;->n:Landroid/widget/TextView;

    iget-object v1, v6, Ldbg;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 1068
    iget-object v0, p1, Laxo;->p:Landroid/widget/TextView;

    iget-object v1, v6, Ldbg;->j:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 1069
    iget-object v0, p1, Laxo;->q:Landroid/widget/TextView;

    iget-object v1, v6, Ldbg;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 1070
    iget-object v0, v6, Ldbg;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1071
    iget-object v0, p1, Laxo;->q:Landroid/widget/TextView;

    iget-object v1, p1, Laxo;->q:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lb;->C:I

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, v6, Ldbg;->e:Ljava/lang/String;

    aput-object v5, v4, v8

    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1075
    :cond_2
    iget-object v0, p1, Laxo;->p:Landroid/widget/TextView;

    if-eqz v0, :cond_4

    .line 1076
    iget-object v0, p1, Laxo;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 1077
    iget v1, v6, Ldbg;->i:I

    if-eq v1, v9, :cond_3

    iget v1, v6, Ldbg;->i:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_7

    .line 1079
    :cond_3
    iget-object v1, p1, Laxo;->p:Landroid/widget/TextView;

    sget v2, La;->dt:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1086
    :cond_4
    :goto_1
    iget-object v0, v6, Ldbg;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v6, Ldbg;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1087
    :cond_5
    iget-object v1, p1, Laxo;->o:Landroid/widget/TextView;

    iget-object v0, v6, Ldbg;->d:Ljava/lang/String;

    .line 1089
    :goto_2
    invoke-static {v1, v0}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 1093
    iget-object v0, v6, Ldbg;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p1, Laxo;->n:Landroid/widget/TextView;

    if-nez v0, :cond_a

    .line 1094
    :cond_6
    iget-object v0, p1, Laxo;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setLines(I)V

    .line 1103
    :goto_3
    iget-object v0, v6, Ldbg;->a:Ldbj;

    iget-object v0, v0, Ldbj;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_b

    iget-object v0, v6, Ldbg;->a:Ldbj;

    iget-object v0, v0, Ldbj;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_b

    .line 1104
    iget v0, p1, Laxo;->r:I

    iget-object v1, v6, Ldbg;->a:Ldbj;

    iget-object v1, v1, Ldbj;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    mul-int/2addr v0, v1

    iget-object v1, v6, Ldbg;->a:Ldbj;

    iget-object v1, v1, Ldbj;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    div-int v4, v0, v1

    .line 1108
    :goto_4
    iget-object v0, p1, Laxo;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1110
    new-array v0, v3, [Ljava/lang/Object;

    iget-object v1, v6, Ldbg;->a:Ldbj;

    iget-object v1, v1, Ldbj;->a:Ljava/lang/String;

    aput-object v1, v0, v8

    .line 1111
    iget-object v0, p1, Laxo;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iget-object v1, p1, Laxo;->k:Landroid/content/Context;

    invoke-static {v1}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v1

    .line 1197
    iget-object v1, v1, Latf;->m:Laer;

    .line 1111
    iget-object v2, v6, Ldbg;->a:Ldbj;

    iget-object v2, v2, Ldbj;->a:Ljava/lang/String;

    iget v5, p1, Laxo;->r:I

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 1113
    iget-object v0, p1, Laxo;->a:Landroid/view/View;

    new-instance v1, Laxp;

    invoke-direct {v1, p1, v6, v7}, Laxp;-><init>(Laxo;Ldbg;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 1081
    :cond_7
    iget-object v1, p1, Laxo;->p:Landroid/widget/TextView;

    sget v2, La;->dm:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_1

    .line 1089
    :cond_8
    iget-object v1, p1, Laxo;->o:Landroid/widget/TextView;

    const-string v2, " \u00b7 "

    iget-object v0, v6, Ldbg;->d:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    :cond_9
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 1096
    :cond_a
    iget-object v0, p1, Laxo;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setLines(I)V

    .line 1097
    iget-object v0, p1, Laxo;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setLines(I)V

    goto/16 :goto_3

    .line 1106
    :cond_b
    const/4 v4, -0x2

    goto :goto_4
.end method
