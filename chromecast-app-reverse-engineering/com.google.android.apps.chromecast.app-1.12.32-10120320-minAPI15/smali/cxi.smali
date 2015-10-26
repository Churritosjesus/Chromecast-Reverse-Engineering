.class final Lcxi;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcwj;


# instance fields
.field private final b:Lclz;

.field private final c:Lcvd;

.field private final d:Ljava/util/Map;

.field private final e:Ljava/util/Map;

.field private final f:Ljava/util/Map;

.field private final g:Lcyt;

.field private final h:Lcyt;

.field private final i:Ljava/util/Set;

.field private final j:Lctw;

.field private final k:Ljava/util/Map;

.field private volatile l:Ljava/lang/String;

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcwj;

    invoke-static {}, Lcyh;->f()Lcje;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    sput-object v0, Lcxi;->a:Lcwj;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lclz;Lctw;Lczd;Lczd;Lcvd;)V
    .locals 9

    .prologue
    const/high16 v2, 0x100000

    const/4 v4, 0x0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "resource cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p2, p0, Lcxi;->b:Lclz;

    new-instance v0, Ljava/util/HashSet;

    .line 1000
    iget-object v1, p2, Lclz;->a:Ljava/util/List;

    .line 0
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcxi;->i:Ljava/util/Set;

    iput-object p3, p0, Lcxi;->j:Lctw;

    iput-object p6, p0, Lcxi;->c:Lcvd;

    new-instance v0, Lcxj;

    invoke-direct {v0, p0}, Lcxj;-><init>(Lcxi;)V

    new-instance v1, Lcyu;

    invoke-direct {v1}, Lcyu;-><init>()V

    invoke-virtual {v1, v2, v0}, Lcyu;->a(ILcyw;)Lcyt;

    move-result-object v0

    iput-object v0, p0, Lcxi;->g:Lcyt;

    new-instance v0, Lcxk;

    invoke-direct {v0, p0}, Lcxk;-><init>(Lcxi;)V

    new-instance v1, Lcyu;

    invoke-direct {v1}, Lcyu;-><init>()V

    invoke-virtual {v1, v2, v0}, Lcyu;->a(ILcyw;)Lcyt;

    move-result-object v0

    iput-object v0, p0, Lcxi;->h:Lcyt;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcxi;->d:Ljava/util/Map;

    new-instance v0, Lcyq;

    invoke-direct {v0, p1}, Lcyq;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->b(Lcvf;)V

    new-instance v0, Lczc;

    invoke-direct {v0, p5}, Lczc;-><init>(Lczd;)V

    invoke-direct {p0, v0}, Lcxi;->b(Lcvf;)V

    new-instance v0, Lczm;

    invoke-direct {v0, p3}, Lczm;-><init>(Lctw;)V

    invoke-direct {p0, v0}, Lcxi;->b(Lcvf;)V

    new-instance v0, Lcuu;

    invoke-direct {v0, p1, p3}, Lcuu;-><init>(Landroid/content/Context;Lctw;)V

    invoke-direct {p0, v0}, Lcxi;->b(Lcvf;)V

    new-instance v0, Lcyb;

    invoke-direct {v0, p1, p3}, Lcyb;-><init>(Landroid/content/Context;Lctw;)V

    invoke-direct {p0, v0}, Lcxi;->b(Lcvf;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcxi;->e:Ljava/util/Map;

    new-instance v0, Lcza;

    invoke-direct {v0}, Lcza;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->c(Lcvf;)V

    new-instance v0, Lcvb;

    invoke-direct {v0}, Lcvb;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->c(Lcvf;)V

    new-instance v0, Lcue;

    invoke-direct {v0}, Lcue;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->c(Lcvf;)V

    new-instance v0, Lcvg;

    invoke-direct {v0}, Lcvg;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->c(Lcvf;)V

    new-instance v0, Lcvh;

    invoke-direct {v0}, Lcvh;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->c(Lcvf;)V

    new-instance v0, Lcvx;

    invoke-direct {v0}, Lcvx;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->c(Lcvf;)V

    new-instance v0, Lcvy;

    invoke-direct {v0}, Lcvy;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->c(Lcvf;)V

    new-instance v0, Lcws;

    invoke-direct {v0}, Lcws;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->c(Lcvf;)V

    new-instance v0, Lcxy;

    invoke-direct {v0}, Lcxy;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->c(Lcvf;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcxi;->f:Ljava/util/Map;

    new-instance v0, Lcwa;

    invoke-direct {v0, p1}, Lcwa;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcww;

    invoke-direct {v0, p1}, Lcww;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcyl;

    invoke-direct {v0, p1}, Lcyl;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcym;

    invoke-direct {v0, p1}, Lcym;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcyn;

    invoke-direct {v0, p1}, Lcyn;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcyo;

    invoke-direct {v0, p1}, Lcyo;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcyp;

    invoke-direct {v0, p1}, Lcyp;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcyx;

    invoke-direct {v0}, Lcyx;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcyz;

    iget-object v1, p0, Lcxi;->b:Lclz;

    .line 2000
    iget-object v1, v1, Lclz;->c:Ljava/lang/String;

    .line 0
    invoke-direct {v0, v1}, Lcyz;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lczc;

    invoke-direct {v0, p4}, Lczc;-><init>(Lczd;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lczf;

    invoke-direct {v0, p3}, Lczf;-><init>(Lctw;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lczn;

    invoke-direct {v0, p1}, Lczn;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lczo;

    invoke-direct {v0}, Lczo;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcva;

    invoke-direct {v0}, Lcva;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcve;

    invoke-direct {v0, p0}, Lcve;-><init>(Lcxi;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcvi;

    invoke-direct {v0}, Lcvi;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcvj;

    invoke-direct {v0}, Lcvj;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcvq;

    invoke-direct {v0, p1}, Lcvq;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcvs;

    invoke-direct {v0}, Lcvs;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcug;

    invoke-direct {v0}, Lcug;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcwd;

    invoke-direct {v0}, Lcwd;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcwf;

    invoke-direct {v0, p1}, Lcwf;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcwk;

    invoke-direct {v0}, Lcwk;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcwo;

    invoke-direct {v0}, Lcwo;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcwp;

    invoke-direct {v0}, Lcwp;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcwr;

    invoke-direct {v0}, Lcwr;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcwt;

    invoke-direct {v0, p1}, Lcwt;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcxq;

    invoke-direct {v0}, Lcxq;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcxr;

    invoke-direct {v0}, Lcxr;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcya;

    invoke-direct {v0}, Lcya;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Lcyi;

    invoke-direct {v0}, Lcyi;-><init>()V

    invoke-direct {p0, v0}, Lcxi;->a(Lcvf;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcxi;->k:Ljava/util/Map;

    iget-object v0, p0, Lcxi;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcmb;

    move v3, v4

    .line 3000
    :goto_0
    iget-object v0, v2, Lcmb;->e:Ljava/util/List;

    .line 0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 4000
    iget-object v0, v2, Lcmb;->e:Ljava/util/List;

    .line 0
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lclx;

    const-string v6, "Unknown"

    iget-object v1, p0, Lcxi;->k:Ljava/util/Map;

    invoke-static {v0}, Lcxi;->a(Lclx;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lcxi;->a(Ljava/util/Map;Ljava/lang/String;)Lcxp;

    move-result-object v7

    invoke-virtual {v7, v2}, Lcxp;->a(Lcmb;)V

    .line 5000
    iget-object v1, v7, Lcxp;->b:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v8, v7, Lcxp;->b:Ljava/util/Map;

    invoke-interface {v8, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6000
    iget-object v0, v7, Lcxp;->d:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v7, Lcxp;->d:Ljava/util/Map;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_4
    move v3, v4

    .line 7000
    :goto_1
    iget-object v0, v2, Lcmb;->f:Ljava/util/List;

    .line 0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 8000
    iget-object v0, v2, Lcmb;->f:Ljava/util/List;

    .line 0
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lclx;

    const-string v6, "Unknown"

    iget-object v1, p0, Lcxi;->k:Ljava/util/Map;

    invoke-static {v0}, Lcxi;->a(Lclx;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lcxi;->a(Ljava/util/Map;Ljava/lang/String;)Lcxp;

    move-result-object v7

    invoke-virtual {v7, v2}, Lcxp;->a(Lcmb;)V

    .line 9000
    iget-object v1, v7, Lcxp;->c:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v8, v7, Lcxp;->c:Ljava/util/Map;

    invoke-interface {v8, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10000
    iget-object v0, v7, Lcxp;->e:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v7, Lcxp;->e:Ljava/util/Map;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lcxi;->b:Lclz;

    .line 11000
    iget-object v0, v0, Lclz;->b:Ljava/util/Map;

    .line 0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_9
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lclx;

    .line 12000
    iget-object v1, v0, Lclx;->a:Ljava/util/Map;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 0
    sget-object v5, Lcit;->C:Lcit;

    invoke-virtual {v5}, Lcit;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcje;

    invoke-static {v1}, Lcyh;->d(Lcje;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v5, p0, Lcxi;->k:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v5, v1}, Lcxi;->a(Ljava/util/Map;Ljava/lang/String;)Lcxp;

    move-result-object v1

    .line 13000
    iput-object v0, v1, Lcxp;->f:Lclx;

    goto :goto_2

    .line 0
    :cond_a
    return-void
.end method

.method private a(Lcje;Ljava/util/Set;Lcyj;)Lcwj;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 0
    iget-boolean v0, p1, Lcje;->l:Z

    if-nez v0, :cond_0

    new-instance v0, Lcwj;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    :goto_0
    return-object v0

    :cond_0
    iget v0, p1, Lcje;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Lcje;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    sget-object v0, Lcxi;->a:Lcwj;

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, La;->a(Lcje;)Lcje;

    move-result-object v3

    iget-object v0, p1, Lcje;->c:[Lcje;

    array-length v0, v0

    new-array v0, v0, [Lcje;

    iput-object v0, v3, Lcje;->c:[Lcje;

    move v1, v2

    :goto_1
    iget-object v0, p1, Lcje;->c:[Lcje;

    array-length v0, v0

    if-ge v1, v0, :cond_2

    iget-object v0, p1, Lcje;->c:[Lcje;

    aget-object v0, v0, v1

    invoke-virtual {p3}, Lcyj;->a()Lcyj;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcxi;->a(Lcje;Ljava/util/Set;Lcyj;)Lcwj;

    move-result-object v0

    sget-object v4, Lcxi;->a:Lcwj;

    if-ne v0, v4, :cond_1

    sget-object v0, Lcxi;->a:Lcwj;

    goto :goto_0

    :cond_1
    iget-object v4, v3, Lcje;->c:[Lcje;

    .line 46000
    iget-object v0, v0, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Lcje;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    new-instance v0, Lcwj;

    invoke-direct {v0, v3, v2}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, La;->a(Lcje;)Lcje;

    move-result-object v3

    iget-object v0, p1, Lcje;->d:[Lcje;

    array-length v0, v0

    iget-object v1, p1, Lcje;->e:[Lcje;

    array-length v1, v1

    if-eq v0, v1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid serving value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcje;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    sget-object v0, Lcxi;->a:Lcwj;

    goto :goto_0

    :cond_3
    iget-object v0, p1, Lcje;->d:[Lcje;

    array-length v0, v0

    new-array v0, v0, [Lcje;

    iput-object v0, v3, Lcje;->d:[Lcje;

    iget-object v0, p1, Lcje;->d:[Lcje;

    array-length v0, v0

    new-array v0, v0, [Lcje;

    iput-object v0, v3, Lcje;->e:[Lcje;

    move v1, v2

    :goto_2
    iget-object v0, p1, Lcje;->d:[Lcje;

    array-length v0, v0

    if-ge v1, v0, :cond_6

    iget-object v0, p1, Lcje;->d:[Lcje;

    aget-object v0, v0, v1

    invoke-virtual {p3}, Lcyj;->b()Lcyj;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcxi;->a(Lcje;Ljava/util/Set;Lcyj;)Lcwj;

    move-result-object v0

    iget-object v4, p1, Lcje;->e:[Lcje;

    aget-object v4, v4, v1

    invoke-virtual {p3}, Lcyj;->c()Lcyj;

    move-result-object v5

    invoke-direct {p0, v4, p2, v5}, Lcxi;->a(Lcje;Ljava/util/Set;Lcyj;)Lcwj;

    move-result-object v4

    sget-object v5, Lcxi;->a:Lcwj;

    if-eq v0, v5, :cond_4

    sget-object v5, Lcxi;->a:Lcwj;

    if-ne v4, v5, :cond_5

    :cond_4
    sget-object v0, Lcxi;->a:Lcwj;

    goto/16 :goto_0

    :cond_5
    iget-object v5, v3, Lcje;->d:[Lcje;

    .line 47000
    iget-object v0, v0, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Lcje;

    aput-object v0, v5, v1

    iget-object v5, v3, Lcje;->e:[Lcje;

    .line 48000
    iget-object v0, v4, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Lcje;

    aput-object v0, v5, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_6
    new-instance v0, Lcwj;

    invoke-direct {v0, v3, v2}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p1, Lcje;->f:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Macro cycle detected.  Current macro reference: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcje;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".  Previous macro references: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    sget-object v0, Lcxi;->a:Lcwj;

    goto/16 :goto_0

    :cond_7
    iget-object v0, p1, Lcje;->f:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lcje;->f:Ljava/lang/String;

    invoke-virtual {p3}, Lcyj;->e()Lcwe;

    move-result-object v1

    invoke-direct {p0, v0, p2, v1}, Lcxi;->a(Ljava/lang/String;Ljava/util/Set;Lcwe;)Lcwj;

    move-result-object v0

    iget-object v1, p1, Lcje;->k:[I

    invoke-static {v0, v1}, La;->a(Lcwj;[I)Lcwj;

    move-result-object v0

    iget-object v1, p1, Lcje;->f:Ljava/lang/String;

    invoke-interface {p2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_4
    invoke-static {p1}, La;->a(Lcje;)Lcje;

    move-result-object v3

    iget-object v0, p1, Lcje;->j:[Lcje;

    array-length v0, v0

    new-array v0, v0, [Lcje;

    iput-object v0, v3, Lcje;->j:[Lcje;

    move v1, v2

    :goto_3
    iget-object v0, p1, Lcje;->j:[Lcje;

    array-length v0, v0

    if-ge v1, v0, :cond_9

    iget-object v0, p1, Lcje;->j:[Lcje;

    aget-object v0, v0, v1

    invoke-virtual {p3}, Lcyj;->d()Lcyj;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcxi;->a(Lcje;Ljava/util/Set;Lcyj;)Lcwj;

    move-result-object v0

    sget-object v4, Lcxi;->a:Lcwj;

    if-ne v0, v4, :cond_8

    sget-object v0, Lcxi;->a:Lcwj;

    goto/16 :goto_0

    :cond_8
    iget-object v4, v3, Lcje;->j:[Lcje;

    .line 49000
    iget-object v0, v0, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Lcje;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :cond_9
    new-instance v0, Lcwj;

    invoke-direct {v0, v3, v2}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method private a(Lclx;Ljava/util/Set;Lcwu;)Lcwj;
    .locals 3

    .prologue
    .line 0
    iget-object v0, p0, Lcxi;->e:Ljava/util/Map;

    invoke-direct {p0, v0, p1, p2, p3}, Lcxi;->a(Ljava/util/Map;Lclx;Ljava/util/Set;Lcwu;)Lcwj;

    move-result-object v1

    .line 19000
    iget-object v0, v1, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Lcje;

    invoke-static {v0}, Lcyh;->d(Lcje;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcyh;->a(Ljava/lang/Object;)Lcje;

    new-instance v2, Lcwj;

    .line 20000
    iget-boolean v1, v1, Lcwj;->b:Z

    .line 0
    invoke-direct {v2, v0, v1}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    return-object v2
.end method

.method private a(Lcmb;Ljava/util/Set;Lcwy;)Lcwj;
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 0
    .line 21000
    iget-object v0, p1, Lcmb;->b:Ljava/util/List;

    .line 0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v3, v1

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lclx;

    invoke-virtual {p3}, Lcwy;->a()Lcwu;

    move-result-object v5

    invoke-direct {p0, v0, p2, v5}, Lcxi;->a(Lclx;Ljava/util/Set;Lcwu;)Lcwj;

    move-result-object v5

    .line 22000
    iget-object v0, v5, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcyh;->a(Ljava/lang/Object;)Lcje;

    new-instance v0, Lcwj;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 23000
    iget-boolean v2, v5, Lcwj;->b:Z

    .line 0
    invoke-direct {v0, v1, v2}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    :goto_1
    return-object v0

    :cond_0
    if-eqz v3, :cond_1

    .line 24000
    iget-boolean v0, v5, Lcwj;->b:Z

    .line 0
    if-eqz v0, :cond_1

    move v0, v1

    :goto_2
    move v3, v0

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_2

    .line 25000
    :cond_2
    iget-object v0, p1, Lcmb;->a:Ljava/util/List;

    .line 0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lclx;

    invoke-virtual {p3}, Lcwy;->b()Lcwu;

    move-result-object v5

    invoke-direct {p0, v0, p2, v5}, Lcxi;->a(Lclx;Ljava/util/Set;Lcwu;)Lcwj;

    move-result-object v5

    .line 26000
    iget-object v0, v5, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcyh;->a(Ljava/lang/Object;)Lcje;

    new-instance v0, Lcwj;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 27000
    iget-boolean v2, v5, Lcwj;->b:Z

    .line 0
    invoke-direct {v0, v1, v2}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1

    :cond_3
    if-eqz v3, :cond_4

    .line 28000
    iget-boolean v0, v5, Lcwj;->b:Z

    .line 0
    if-eqz v0, :cond_4

    move v0, v1

    :goto_4
    move v3, v0

    goto :goto_3

    :cond_4
    move v0, v2

    goto :goto_4

    :cond_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcyh;->a(Ljava/lang/Object;)Lcje;

    new-instance v0, Lcwj;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Ljava/util/Set;Lcwe;)Lcwj;
    .locals 10

    .prologue
    const/4 v9, 0x1

    .line 0
    iget v0, p0, Lcxi;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcxi;->m:I

    iget-object v0, p0, Lcxi;->h:Lcyt;

    invoke-interface {v0, p1}, Lcyt;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcxo;

    if-eqz v0, :cond_0

    .line 29000
    iget-object v1, v0, Lcxo;->b:Lcje;

    .line 0
    invoke-direct {p0, v1, p2}, Lcxi;->a(Lcje;Ljava/util/Set;)V

    iget v1, p0, Lcxi;->m:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcxi;->m:I

    .line 30000
    iget-object v0, v0, Lcxo;->a:Lcwj;

    .line 0
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcxi;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcxp;

    if-nez v8, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcxi;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Invalid macro: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    iget v0, p0, Lcxi;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcxi;->m:I

    sget-object v0, Lcxi;->a:Lcwj;

    goto :goto_0

    .line 31000
    :cond_1
    iget-object v1, v8, Lcxp;->a:Ljava/util/Set;

    .line 32000
    iget-object v2, v8, Lcxp;->b:Ljava/util/Map;

    .line 33000
    iget-object v3, v8, Lcxp;->d:Ljava/util/Map;

    .line 34000
    iget-object v4, v8, Lcxp;->c:Ljava/util/Map;

    .line 35000
    iget-object v5, v8, Lcxp;->e:Ljava/util/Map;

    .line 0
    invoke-virtual {p3}, Lcwe;->b()Lcxh;

    move-result-object v7

    move-object v0, p0

    move-object v6, p2

    invoke-direct/range {v0 .. v7}, Lcxi;->a(Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcxh;)Lcwj;

    move-result-object v1

    .line 36000
    iget-object v0, v1, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 37000
    iget-object v0, v8, Lcxp;->f:Lclx;

    move-object v2, v0

    .line 0
    :goto_1
    if-nez v2, :cond_4

    iget v0, p0, Lcxi;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcxi;->m:I

    sget-object v0, Lcxi;->a:Lcwj;

    goto :goto_0

    .line 38000
    :cond_2
    iget-object v0, v1, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-le v0, v9, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcxi;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "Multiple macros active for macroName "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    .line 39000
    :cond_3
    iget-object v0, v1, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lclx;

    move-object v2, v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcxi;->f:Ljava/util/Map;

    invoke-virtual {p3}, Lcwe;->a()Lcwu;

    move-result-object v3

    invoke-direct {p0, v0, v2, p2, v3}, Lcxi;->a(Ljava/util/Map;Lclx;Ljava/util/Set;Lcwu;)Lcwj;

    move-result-object v3

    .line 40000
    iget-boolean v0, v1, Lcwj;->b:Z

    .line 0
    if-eqz v0, :cond_6

    .line 41000
    iget-boolean v0, v3, Lcwj;->b:Z

    .line 0
    if-eqz v0, :cond_6

    move v0, v9

    :goto_2
    sget-object v1, Lcxi;->a:Lcwj;

    if-ne v3, v1, :cond_7

    sget-object v0, Lcxi;->a:Lcwj;

    .line 43000
    :goto_3
    iget-object v1, v2, Lclx;->b:Lcje;

    .line 44000
    iget-boolean v2, v0, Lcwj;->b:Z

    .line 0
    if-eqz v2, :cond_5

    iget-object v2, p0, Lcxi;->h:Lcyt;

    new-instance v3, Lcxo;

    invoke-direct {v3, v0, v1}, Lcxo;-><init>(Lcwj;Lcje;)V

    invoke-interface {v2, p1, v3}, Lcyt;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    invoke-direct {p0, v1, p2}, Lcxi;->a(Lcje;Ljava/util/Set;)V

    iget v1, p0, Lcxi;->m:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcxi;->m:I

    goto/16 :goto_0

    :cond_6
    const/4 v0, 0x0

    goto :goto_2

    :cond_7
    new-instance v1, Lcwj;

    .line 42000
    iget-object v3, v3, Lcwj;->a:Ljava/lang/Object;

    .line 0
    invoke-direct {v1, v3, v0}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    move-object v0, v1

    goto :goto_3
.end method

.method private a(Ljava/util/Map;Lclx;Ljava/util/Set;Lcwu;)Lcwj;
    .locals 10

    .prologue
    .line 0
    .line 50000
    iget-object v0, p2, Lclx;->a:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 0
    sget-object v1, Lcit;->p:Lcit;

    invoke-virtual {v1}, Lcit;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    if-nez v0, :cond_1

    const-string v0, "No function id in properties"

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    sget-object v1, Lcxi;->a:Lcwj;

    :cond_0
    :goto_0
    return-object v1

    :cond_1
    iget-object v5, v0, Lcje;->g:Ljava/lang/String;

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcvf;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " has no backing implementation."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    sget-object v1, Lcxi;->a:Lcwj;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcxi;->g:Lcyt;

    invoke-interface {v1, p2}, Lcyt;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcwj;

    if-nez v1, :cond_0

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const/4 v4, 0x1

    .line 51000
    iget-object v1, p2, Lclx;->a:Ljava/util/Map;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 0
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-virtual {p4}, Lcwu;->a()Lcwx;

    move-result-object v2

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcje;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    invoke-virtual {v2}, Lcwx;->a()Lcyj;

    move-result-object v2

    invoke-direct {p0, v1, p3, v2}, Lcxi;->a(Lcje;Ljava/util/Set;Lcyj;)Lcwj;

    move-result-object v8

    sget-object v1, Lcxi;->a:Lcwj;

    if-ne v8, v1, :cond_3

    sget-object v1, Lcxi;->a:Lcwj;

    goto :goto_0

    .line 51001
    :cond_3
    iget-boolean v1, v8, Lcwj;->b:Z

    .line 0
    if-eqz v1, :cond_4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 51002
    iget-object v2, v8, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v2, Lcje;

    .line 51003
    iget-object v9, p2, Lclx;->a:Ljava/util/Map;

    invoke-interface {v9, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v4

    .line 0
    :goto_2
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 51004
    iget-object v3, v8, Lcwj;->a:Ljava/lang/Object;

    .line 0
    invoke-interface {v6, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    goto :goto_2

    :cond_5
    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 51005
    iget-object v2, v0, Lcvf;->a:Ljava/util/Set;

    invoke-interface {v1, v2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    .line 0
    if-nez v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Incorrect keys for function "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " required "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcvf;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " had "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    sget-object v1, Lcxi;->a:Lcwj;

    goto/16 :goto_0

    :cond_6
    if-eqz v4, :cond_8

    invoke-virtual {v0}, Lcvf;->a()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, 0x1

    :goto_3
    new-instance v2, Lcwj;

    invoke-virtual {v0, v6}, Lcvf;->a(Ljava/util/Map;)Lcje;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    if-eqz v1, :cond_7

    iget-object v0, p0, Lcxi;->g:Lcyt;

    invoke-interface {v0, p2, v2}, Lcyt;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    move-object v1, v2

    goto/16 :goto_0

    :cond_8
    const/4 v1, 0x0

    goto :goto_3
.end method

.method private a(Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcxh;)Lcwj;
    .locals 6

    new-instance v0, Lcxl;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcxl;-><init>(Lcxi;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-direct {p0, p1, p6, v0, p7}, Lcxi;->a(Ljava/util/Set;Ljava/util/Set;Lcxn;Lcxh;)Lcwj;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/Set;Ljava/util/Set;Lcxn;Lcxh;)Lcwj;
    .locals 9

    .prologue
    const/4 v3, 0x1

    .line 0
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v3

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcmb;

    invoke-virtual {p4}, Lcxh;->a()Lcwy;

    move-result-object v7

    invoke-direct {p0, v0, p2, v7}, Lcxi;->a(Lcmb;Ljava/util/Set;Lcwy;)Lcwj;

    move-result-object v8

    .line 16000
    iget-object v1, v8, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3, v0, v4, v5, v7}, Lcxn;->a(Lcmb;Ljava/util/Set;Ljava/util/Set;Lcwy;)V

    :cond_0
    if-eqz v2, :cond_1

    .line 17000
    iget-boolean v0, v8, Lcwj;->b:Z

    .line 0
    if-eqz v0, :cond_1

    move v0, v3

    :goto_1
    move v2, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    invoke-interface {v4, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    new-instance v0, Lcwj;

    invoke-direct {v0, v4, v2}, Lcwj;-><init>(Ljava/lang/Object;Z)V

    return-object v0
.end method

.method private static a(Ljava/util/Map;Ljava/lang/String;)Lcxp;
    .locals 1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcxp;

    if-nez v0, :cond_0

    new-instance v0, Lcxp;

    invoke-direct {v0}, Lcxp;-><init>()V

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private static a(Lclx;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 0
    .line 18000
    iget-object v0, p0, Lclx;->a:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 0
    sget-object v1, Lcit;->u:Lcit;

    invoke-virtual {v1}, Lcit;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    invoke-static {v0}, Lcyh;->a(Lcje;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcje;Ljava/util/Set;)V
    .locals 3

    .prologue
    .line 0
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcyj;

    invoke-direct {v0}, Lcyj;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcxi;->a(Lcje;Ljava/util/Set;Lcyj;)Lcwj;

    move-result-object v0

    sget-object v1, Lcxi;->a:Lcwj;

    if-eq v0, v1, :cond_0

    .line 45000
    iget-object v0, v0, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Lcje;

    invoke-static {v0}, Lcyh;->e(Lcje;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lcxi;->j:Lctw;

    invoke-virtual {v1, v0}, Lctw;->a(Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Map;

    if-eqz v2, :cond_3

    check-cast v0, Ljava/util/Map;

    iget-object v2, p0, Lcxi;->j:Lctw;

    invoke-virtual {v2, v0}, Lctw;->a(Ljava/util/Map;)V

    goto :goto_1

    :cond_3
    const-string v0, "pushAfterEvaluate: value not a Map"

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string v0, "pushAfterEvaluate: value not a Map or List"

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Lcvf;)V
    .locals 1

    iget-object v0, p0, Lcxi;->f:Ljava/util/Map;

    invoke-static {v0, p1}, Lcxi;->a(Ljava/util/Map;Lcvf;)V

    return-void
.end method

.method private static a(Ljava/util/Map;Lcvf;)V
    .locals 3

    invoke-virtual {p1}, Lcvf;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Duplicate function type name: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcvf;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcvf;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcxi;->m:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, p0, Lcxi;->m:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x2

    :goto_1
    iget v2, p0, Lcxi;->m:I

    if-ge v0, v2, :cond_1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private b(Lcvf;)V
    .locals 1

    iget-object v0, p0, Lcxi;->d:Ljava/util/Map;

    invoke-static {v0, p1}, Lcxi;->a(Ljava/util/Map;Lcvf;)V

    return-void
.end method

.method private c(Lcvf;)V
    .locals 1

    iget-object v0, p0, Lcxi;->e:Ljava/util/Map;

    invoke-static {v0, p1}, Lcxi;->a(Ljava/util/Map;Lcvf;)V

    return-void
.end method

.method private declared-synchronized c(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcxi;->l:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method final declared-synchronized a()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcxi;->l:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 0
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcxi;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcxi;->c:Lcvd;

    invoke-virtual {v0}, Lcvd;->b()Lcvc;

    move-result-object v0

    invoke-virtual {v0}, Lcvc;->b()Lcze;

    move-result-object v1

    iget-object v0, p0, Lcxi;->i:Ljava/util/Set;

    invoke-virtual {v1}, Lcze;->b()Lcxh;

    move-result-object v2

    .line 14000
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Lcxm;

    invoke-direct {v4, p0}, Lcxm;-><init>(Lcxi;)V

    invoke-direct {p0, v0, v3, v4, v2}, Lcxi;->a(Ljava/util/Set;Ljava/util/Set;Lcxn;Lcxh;)Lcwj;

    move-result-object v0

    .line 15000
    iget-object v0, v0, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lclx;

    iget-object v3, p0, Lcxi;->d:Ljava/util/Map;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v1}, Lcze;->a()Lcwu;

    move-result-object v5

    invoke-direct {p0, v3, v0, v4, v5}, Lcxi;->a(Ljava/util/Map;Lclx;Ljava/util/Set;Lcwu;)Lcwj;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-direct {p0, v0}, Lcxi;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized a(Ljava/util/List;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcjc;

    iget-object v2, v0, Lcjc;->a:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcjc;->a:Ljava/lang/String;

    const-string v3, "gaExperiment:"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Ignored supplemental: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_1
    iget-object v2, p0, Lcxi;->j:Lctw;

    invoke-static {v2, v0}, La;->a(Lctw;Lcjc;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_2
    monitor-exit p0

    return-void
.end method

.method public final b(Ljava/lang/String;)Lcwj;
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcxi;->m:I

    iget-object v0, p0, Lcxi;->c:Lcvd;

    invoke-virtual {v0}, Lcvd;->a()Lcvc;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v0}, Lcvc;->a()Lcwe;

    move-result-object v0

    invoke-direct {p0, p1, v1, v0}, Lcxi;->a(Ljava/lang/String;Ljava/util/Set;Lcwe;)Lcwj;

    move-result-object v0

    return-object v0
.end method
