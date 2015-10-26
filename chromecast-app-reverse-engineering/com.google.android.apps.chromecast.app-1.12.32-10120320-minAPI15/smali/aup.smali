.class public final Laup;
.super Latt;
.source "PG"


# instance fields
.field private final n:Laea;

.field private final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laea;Ladz;)V
    .locals 4

    .prologue
    .line 26
    const-string v0, "ThirdPartyRevocationRequest"

    const-string v1, "/third-party-revocation"

    invoke-static {p1, v1}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1033
    new-instance v2, Ldcl;

    invoke-direct {v2}, Ldcl;-><init>()V

    .line 1034
    iput-object p3, v2, Ldcl;->e:Ljava/lang/String;

    .line 1035
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v2, Ldcl;->c:Ljava/lang/Boolean;

    .line 1036
    invoke-static {v2}, Ldcl;->a(Ldew;)[B

    move-result-object v2

    .line 26
    invoke-direct {p0, v0, v1, v2, p5}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 28
    iput-object p2, p0, Laup;->o:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Laup;->n:Laea;

    .line 30
    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 16
    check-cast p1, [B

    .line 1053
    iget-object v0, p0, Laup;->n:Laea;

    if-eqz v0, :cond_0

    .line 1056
    const/4 v1, 0x0

    .line 1057
    if-eqz p1, :cond_1

    .line 1059
    :try_start_0
    invoke-static {p1}, Ldbv;->a([B)Ldbv;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1064
    :goto_0
    iget-object v1, p0, Laup;->n:Laea;

    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V

    .line 16
    :cond_0
    return-void

    .line 1060
    :catch_0
    move-exception v0

    .line 1061
    const-string v2, "ThirdPartyRevocationRequest"

    const-string v3, "Could not load device backdrop settings: "

    invoke-virtual {v0}, Ldev;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    const-string v0, "oauth2:https://www.google.com/accounts/OAuthLogin"

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Laup;->o:Ljava/lang/String;

    return-object v0
.end method
