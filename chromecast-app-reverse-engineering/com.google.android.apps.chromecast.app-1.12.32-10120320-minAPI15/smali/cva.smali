.class final Lcva;
.super Lcvf;


# static fields
.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcip;->v:Lcip;

    invoke-virtual {v0}, Lcip;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcva;->b:Ljava/lang/String;

    sget-object v0, Lcit;->f:Lcit;

    invoke-virtual {v0}, Lcit;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcva;->c:Ljava/lang/String;

    sget-object v0, Lcit;->D:Lcit;

    invoke-virtual {v0}, Lcit;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcva;->d:Ljava/lang/String;

    sget-object v0, Lcit;->t:Lcit;

    invoke-virtual {v0}, Lcit;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcva;->e:Ljava/lang/String;

    sget-object v0, Lcit;->E:Lcit;

    invoke-virtual {v0}, Lcit;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcva;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    sget-object v0, Lcva;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    sget-object v3, Lcva;->c:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-direct {p0, v0, v1}, Lcvf;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Lcje;
    .locals 5

    sget-object v0, Lcva;->c:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    if-eqz v0, :cond_0

    invoke-static {}, Lcyh;->f()Lcje;

    move-result-object v1

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-static {}, Lcyh;->f()Lcje;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    invoke-static {v0}, Lcyh;->a(Lcje;)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lcva;->e:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    if-nez v0, :cond_3

    const-string v0, "text"

    move-object v1, v0

    :goto_1
    sget-object v0, Lcva;->f:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    if-nez v0, :cond_4

    const-string v0, "base16"

    move-object v2, v0

    :goto_2
    const/4 v3, 0x2

    sget-object v0, Lcva;->d:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcyh;->d(Lcje;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    move v3, v0

    :cond_2
    :try_start_0
    const-string v0, "text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_3
    const-string v1, "base16"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {v0}, La;->b([B)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lcyh;->a(Ljava/lang/Object;)Lcje;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lcyh;->a(Lcje;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lcyh;->a(Lcje;)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto :goto_2

    :cond_5
    :try_start_1
    const-string v0, "base16"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v4}, La;->m(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_3

    :cond_6
    const-string v0, "base64"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v4, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    goto :goto_3

    :cond_7
    const-string v0, "base64url"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    or-int/lit8 v0, v3, 0x8

    invoke-static {v4, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    goto :goto_3

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Encode: unknown input format: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    invoke-static {}, Lcyh;->f()Lcje;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Encode: invalid input:"

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    invoke-static {}, Lcyh;->f()Lcje;

    move-result-object v0

    goto/16 :goto_0

    :cond_9
    const-string v1, "base64"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {v0, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_a
    const-string v1, "base64url"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    or-int/lit8 v1, v3, 0x8

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Encode: unknown output format: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    invoke-static {}, Lcyh;->f()Lcje;

    move-result-object v0

    goto/16 :goto_0
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
