.class final Lczm;
.super Lcyf;


# static fields
.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;


# instance fields
.field private final e:Lctw;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcip;->C:Lcip;

    invoke-virtual {v0}, Lcip;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lczm;->b:Ljava/lang/String;

    sget-object v0, Lcit;->M:Lcit;

    invoke-virtual {v0}, Lcit;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lczm;->c:Ljava/lang/String;

    sget-object v0, Lcit;->h:Lcit;

    invoke-virtual {v0}, Lcit;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lczm;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lctw;)V
    .locals 4

    sget-object v0, Lczm;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    sget-object v3, Lczm;->c:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-direct {p0, v0, v1}, Lcyf;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    iput-object p1, p0, Lczm;->e:Lctw;

    return-void
.end method


# virtual methods
.method public final b(Ljava/util/Map;)V
    .locals 3

    .prologue
    .line 0
    sget-object v0, Lczm;->c:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    .line 1000
    if-eqz v0, :cond_0

    invoke-static {}, Lcyh;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 0
    :cond_0
    sget-object v0, Lczm;->d:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    .line 2000
    if-eqz v0, :cond_1

    invoke-static {}, Lcyh;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_4

    :cond_1
    :goto_0
    return-void

    .line 1000
    :cond_2
    invoke-static {v0}, Lcyh;->e(Lcje;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Map;

    if-eqz v2, :cond_3

    check-cast v0, Ljava/util/Map;

    iget-object v2, p0, Lczm;->e:Lctw;

    invoke-virtual {v2, v0}, Lctw;->a(Ljava/util/Map;)V

    goto :goto_1

    .line 2000
    :cond_4
    invoke-static {v0}, Lcyh;->a(Lcje;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcyh;->e()Ljava/lang/String;

    move-result-object v1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lczm;->e:Lctw;

    invoke-virtual {v1, v0}, Lctw;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
