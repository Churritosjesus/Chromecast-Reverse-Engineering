.class public final Lbkb;
.super Lac;
.source "PG"


# instance fields
.field public final b:[Ldap;


# direct methods
.method public constructor <init>(Lr;[Ldap;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lac;-><init>(Lr;)V

    .line 18
    iput-object p2, p0, Lbkb;->b:[Ldap;

    .line 19
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lbkb;->b:[Ldap;

    array-length v0, v0

    return v0
.end method

.method public final a(I)Lj;
    .locals 3

    .prologue
    .line 23
    iget-object v0, p0, Lbkb;->b:[Ldap;

    aget-object v0, v0, p1

    .line 24
    iget-object v1, v0, Ldap;->a:Ljava/lang/String;

    iget-object v2, v0, Ldap;->b:Ljava/lang/String;

    iget-object v0, v0, Ldap;->c:Ljava/lang/String;

    .line 25
    invoke-static {v1, v2, v0}, Lbkc;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbkc;

    move-result-object v0

    .line 26
    return-object v0
.end method
