.class public final Lcqs;
.super Landroid/widget/BaseAdapter;
.source "PG"


# static fields
.field private static final f:I


# instance fields
.field public a:Lcqj;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Lcqe;

.field private g:Lcqv;

.field private h:Ls;

.field private i:I

.field private j:Landroid/view/LayoutInflater;

.field private k:I

.field private l:Landroid/content/Context;

.field private m:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    sget v0, La;->ip:I

    sput v0, Lcqs;->f:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILcqv;Ls;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    .line 74
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcqs;->m:Ljava/util/ArrayList;

    .line 76
    iput-boolean v1, p0, Lcqs;->b:Z

    .line 77
    iput-boolean v1, p0, Lcqs;->c:Z

    .line 78
    iput-object p1, p0, Lcqs;->l:Landroid/content/Context;

    .line 79
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    :goto_0
    iput p2, p0, Lcqs;->i:I

    .line 80
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcqs;->j:Landroid/view/LayoutInflater;

    .line 81
    if-eqz p3, :cond_1

    :goto_1
    iput-object p3, p0, Lcqs;->g:Lcqv;

    .line 82
    iput-object p4, p0, Lcqs;->h:Ls;

    .line 84
    new-array v0, v1, [I

    sget v1, La;->hI:I

    aput v1, v0, v3

    .line 87
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 88
    iget v1, v1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 90
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, La;->hK:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 89
    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcqs;->k:I

    .line 91
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 92
    new-instance v0, Lcqe;

    invoke-direct {v0, p1}, Lcqe;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcqs;->e:Lcqe;

    .line 93
    return-void

    .line 79
    :cond_0
    sget p2, Lcqs;->f:I

    goto :goto_0

    .line 81
    :cond_1
    new-instance p3, Lcqt;

    .line 1172
    invoke-direct {p3, p0}, Lcqt;-><init>(Lcqs;)V

    goto :goto_1
.end method

.method public static a(Ljava/util/List;Lcsq;Lcsq;)Ljava/util/List;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v2, -0x1

    .line 353
    .line 355
    if-eqz p2, :cond_2

    invoke-interface {p2}, Lcsq;->a()Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    .line 357
    :goto_0
    if-eqz p1, :cond_3

    invoke-interface {p1}, Lcsq;->a()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 359
    :goto_1
    const/4 v0, 0x0

    move v3, v2

    move v4, v2

    move v2, v0

    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 360
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcsq;

    .line 361
    if-gez v4, :cond_0

    invoke-interface {v0}, Lcsq;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v4, v2

    .line 364
    :cond_0
    if-gez v3, :cond_1

    invoke-interface {v0}, Lcsq;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v3, v2

    .line 359
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    :cond_2
    move-object v5, v0

    .line 356
    goto :goto_0

    :cond_3
    move-object v1, v0

    .line 357
    goto :goto_1

    .line 368
    :cond_4
    if-ltz v4, :cond_5

    .line 369
    invoke-interface {p0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 371
    :cond_5
    if-gez v3, :cond_6

    if-eqz v1, :cond_6

    .line 372
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 373
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 375
    :cond_6
    return-object p0
.end method

.method private b(I)Z
    .locals 2

    .prologue
    .line 298
    .line 3308
    iget-boolean v0, p0, Lcqs;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x2

    .line 299
    :goto_0
    iget-boolean v1, p0, Lcqs;->c:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcqs;->getCount()I

    move-result v1

    add-int/2addr v0, v1

    if-ne p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    return v0

    .line 3308
    :cond_0
    const/4 v0, -0x1

    goto :goto_0

    .line 299
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private c(I)Z
    .locals 1

    .prologue
    .line 304
    iget-boolean v0, p0, Lcqs;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcqs;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(I)Lcsq;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 290
    invoke-direct {p0, p1}, Lcqs;->b(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1}, Lcqs;->c(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 293
    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-object v1, p0, Lcqs;->m:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcqs;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcsq;

    goto :goto_0
.end method

.method public final a(Ljava/util/List;)V
    .locals 6

    .prologue
    .line 259
    .line 1268
    iget-boolean v0, p0, Lcqs;->d:Z

    if-eqz v0, :cond_1

    .line 1269
    iget-object v0, p0, Lcqs;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1270
    if-eqz p1, :cond_0

    .line 1271
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcsq;

    .line 1272
    iget-object v2, p0, Lcqs;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1275
    :cond_0
    invoke-virtual {p0}, Lcqs;->notifyDataSetChanged()V

    .line 1279
    :goto_1
    invoke-virtual {p0}, Lcqs;->notifyDataSetChanged()V

    .line 260
    return-void

    .line 1277
    :cond_1
    iget-object v2, p0, Lcqs;->e:Lcqe;

    .line 2056
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2058
    :cond_2
    invoke-virtual {v2}, Lcqe;->a()V

    .line 2077
    :cond_3
    :goto_2
    iget-object v0, v2, Lcqe;->b:Ljava/util/ArrayList;

    .line 1277
    iput-object v0, p0, Lcqs;->m:Ljava/util/ArrayList;

    goto :goto_1

    .line 3043
    :cond_4
    iget-object v0, v2, Lcqe;->e:Landroid/accounts/AccountManager;

    if-nez v0, :cond_5

    .line 3044
    iget-object v0, v2, Lcqe;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    iput-object v0, v2, Lcqe;->e:Landroid/accounts/AccountManager;

    .line 3047
    :cond_5
    iget-object v0, v2, Lcqe;->e:Landroid/accounts/AccountManager;

    const-string v1, "com.google"

    invoke-virtual {v0, v1}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v0

    iput-object v0, v2, Lcqe;->c:[Landroid/accounts/Account;

    .line 3081
    iget-object v0, v2, Lcqe;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 3082
    if-eqz p1, :cond_6

    .line 3083
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcsq;

    .line 3084
    iget-object v3, v2, Lcqe;->d:Ljava/util/HashMap;

    invoke-interface {v0}, Lcsq;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 2064
    :cond_6
    iget-object v0, v2, Lcqe;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2065
    invoke-virtual {v2}, Lcqe;->a()V

    goto :goto_2

    .line 2068
    :cond_7
    iget-object v0, v2, Lcqe;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2069
    iget-object v3, v2, Lcqe;->c:[Landroid/accounts/Account;

    array-length v4, v3

    const/4 v0, 0x0

    move v1, v0

    :goto_4
    if-ge v1, v4, :cond_3

    aget-object v0, v3, v1

    .line 2070
    iget-object v5, v2, Lcqe;->d:Ljava/util/HashMap;

    iget-object v0, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcsq;

    .line 2071
    if-eqz v0, :cond_8

    .line 2072
    iget-object v5, v2, Lcqe;->b:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2069
    :cond_8
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4
.end method

.method public final getCount()I
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 284
    iget-boolean v0, p0, Lcqs;->b:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    iget-boolean v3, p0, Lcqs;->c:Z

    if-eqz v3, :cond_2

    :goto_1
    add-int/2addr v0, v1

    iget-object v1, p0, Lcqs;->m:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 285
    iget-object v1, p0, Lcqs;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :cond_0
    add-int/2addr v0, v2

    return v0

    :cond_1
    move v0, v2

    .line 284
    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 28
    invoke-virtual {p0, p1}, Lcqs;->a(I)Lcsq;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 3

    .prologue
    const-wide/16 v0, -0x1

    .line 315
    invoke-direct {p0, p1}, Lcqs;->c(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 316
    const-wide/16 v0, -0x2

    .line 320
    :cond_0
    :goto_0
    return-wide v0

    .line 317
    :cond_1
    invoke-direct {p0, p1}, Lcqs;->b(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 320
    iget-object v2, p0, Lcqs;->m:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    iget-object v0, p0, Lcqs;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcsq;

    invoke-interface {v0}, Lcsq;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    int-to-long v0, v0

    goto :goto_0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .prologue
    .line 145
    invoke-direct {p0, p1}, Lcqs;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    const/4 v0, 0x2

    .line 151
    :goto_0
    return v0

    .line 148
    :cond_0
    invoke-direct {p0, p1}, Lcqs;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    const/4 v0, 0x1

    goto :goto_0

    .line 151
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    const/4 v5, 0x0

    .line 115
    invoke-virtual {p0, p1}, Lcqs;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 117
    if-nez p2, :cond_0

    .line 118
    iget-object v0, p0, Lcqs;->j:Landroid/view/LayoutInflater;

    sget v1, La;->is:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 135
    :cond_0
    :goto_0
    return-object p2

    .line 120
    :cond_1
    invoke-virtual {p0, p1}, Lcqs;->getItemViewType(I)I

    move-result v0

    if-ne v0, v7, :cond_2

    .line 122
    if-nez p2, :cond_0

    .line 123
    iget-object v0, p0, Lcqs;->j:Landroid/view/LayoutInflater;

    sget v1, La;->ir:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 126
    :cond_2
    if-nez p2, :cond_3

    .line 127
    iget-object v0, p0, Lcqs;->j:Landroid/view/LayoutInflater;

    iget v1, p0, Lcqs;->i:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 129
    :cond_3
    invoke-virtual {p0, p1}, Lcqs;->a(I)Lcsq;

    move-result-object v1

    .line 130
    iget-object v2, p0, Lcqs;->a:Lcqj;

    iget-object v0, p0, Lcqs;->g:Lcqv;

    iget-object v3, p0, Lcqs;->h:Ls;

    .line 132
    iget v3, p0, Lcqs;->k:I

    .line 1219
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_5

    .line 1220
    invoke-interface {v0, p2}, Lcqv;->a(Landroid/view/View;)Lcqu;

    move-result-object v0

    .line 1221
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1226
    :goto_1
    iget-object v4, v0, Lcqu;->b:Landroid/widget/ImageView;

    if-eqz v4, :cond_4

    if-eqz v2, :cond_4

    .line 1227
    iget-object v4, v0, Lcqu;->b:Landroid/widget/ImageView;

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1228
    invoke-interface {v1}, Lcsq;->c()Ljava/lang/String;

    move-result-object v4

    .line 1229
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 1230
    iget-object v4, v0, Lcqu;->b:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Lcqj;->a(Landroid/widget/ImageView;)V

    .line 1231
    iget-object v4, v0, Lcqu;->b:Landroid/widget/ImageView;

    invoke-interface {v1}, Lcsq;->a()Ljava/lang/String;

    move-result-object v5

    .line 1232
    invoke-interface {v1}, Lcsq;->d()Ljava/lang/String;

    move-result-object v6

    .line 1231
    invoke-virtual {v2, v4, v5, v6, v7}, Lcqj;->a(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1240
    :cond_4
    :goto_2
    iget-object v2, v0, Lcqu;->a:Landroid/widget/TextView;

    if-eqz v2, :cond_0

    .line 1241
    iget-object v2, v0, Lcqu;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1242
    iget-object v2, v0, Lcqu;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1243
    iget-object v2, v0, Lcqu;->a:Landroid/widget/TextView;

    invoke-interface {v1}, Lcsq;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1244
    iget-object v0, v0, Lcqu;->a:Landroid/widget/TextView;

    iget-object v2, p0, Lcqs;->l:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lb;->eB:I

    new-array v4, v7, [Ljava/lang/Object;

    .line 1245
    invoke-interface {v1}, Lcsq;->a()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v8

    .line 1244
    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1223
    :cond_5
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcqu;

    goto :goto_1

    .line 1234
    :cond_6
    iget-object v4, v0, Lcqu;->b:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Lcqj;->a(Landroid/widget/ImageView;)V

    .line 1236
    iget-object v2, v0, Lcqu;->b:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 1237
    invoke-interface {v1}, Lcsq;->a()Ljava/lang/String;

    invoke-interface {v1}, Lcsq;->d()Ljava/lang/String;

    .line 1236
    invoke-static {v4}, Lcqj;->a(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2
.end method

.method public final getViewTypeCount()I
    .locals 1

    .prologue
    .line 140
    const/4 v0, 0x3

    return v0
.end method
