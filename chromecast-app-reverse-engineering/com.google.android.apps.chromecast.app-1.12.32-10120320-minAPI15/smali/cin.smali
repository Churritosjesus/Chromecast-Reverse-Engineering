.class public final Lcin;
.super Ljava/lang/Object;


# instance fields
.field final a:Lcio;


# direct methods
.method public constructor <init>(Lcio;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Callbacks must not be null."

    invoke-static {p1, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcin;->a:Lcio;

    return-void
.end method
