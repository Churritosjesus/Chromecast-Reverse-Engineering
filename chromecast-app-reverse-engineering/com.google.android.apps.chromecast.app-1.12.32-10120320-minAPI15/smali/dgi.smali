.class public abstract Ldgi;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static b:Ldgi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const-class v0, Ldft;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ldgi;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ldfh;Ldhg;)Ldhw;
.end method

.method public abstract a(Ldft;)Ls;
.end method

.method public abstract a(Ldfh;Ldfx;)V
.end method

.method public abstract a(Ldfh;Ljava/lang/Object;)V
.end method

.method public abstract a(Ldfi;Ldfh;)V
.end method

.method public abstract a(Ldfk;Ljavax/net/ssl/SSLSocket;Z)V
.end method

.method public abstract a(Ldfp;Ljava/lang/String;)V
.end method

.method public abstract a(Ldft;Ldfh;Ldhg;Ldfy;)V
.end method

.method public abstract a(Ldfh;)Z
.end method

.method public abstract b(Ldfh;)I
.end method

.method public abstract b(Ldft;)Ldgr;
.end method

.method public abstract b(Ldfh;Ldhg;)V
.end method

.method public abstract c(Ldft;)Ldgk;
.end method

.method public abstract c(Ldfh;)Z
.end method
