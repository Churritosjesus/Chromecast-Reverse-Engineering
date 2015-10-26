.class public interface abstract Ldiq;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ldiq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    new-instance v0, Ldir;

    invoke-direct {v0}, Ldir;-><init>()V

    sput-object v0, Ldiq;->a:Ldiq;

    return-void
.end method


# virtual methods
.method public abstract a(Ldjn;)V
.end method
