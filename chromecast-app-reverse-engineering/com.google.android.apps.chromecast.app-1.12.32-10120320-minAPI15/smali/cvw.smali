.class final Lcvw;
.super Landroid/util/LruCache;


# instance fields
.field private synthetic a:Lcyw;


# direct methods
.method constructor <init>(Lcvv;ILcyw;)V
    .locals 0

    iput-object p3, p0, Lcvw;->a:Lcyw;

    invoke-direct {p0, p2}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected final sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcvw;->a:Lcyw;

    invoke-interface {v0, p1, p2}, Lcyw;->a(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
