.class final Lahl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x2288d511ce8549edL


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 240
    iput-object p1, p0, Lahl;->a:Ljava/lang/String;

    .line 241
    iput-object p2, p0, Lahl;->b:Ljava/lang/String;

    .line 242
    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 245
    new-instance v0, Lahk;

    iget-object v1, p0, Lahl;->a:Ljava/lang/String;

    iget-object v2, p0, Lahl;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lahk;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
